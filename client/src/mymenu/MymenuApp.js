import React, {Component} from 'react';
import {browserHistory} from "react-router";
import axios from 'axios';
import HeaderMember from '../HeaderMember';
import '../css/mymenu.css'
import 'font-awesome/css/font-awesome.min.css';

class MymenuApp extends Component {

    state = {
        menus: []
    }

    componentDidMount() {
        //get url api
        axios.get('https://jsonplaceholder.typicode.com/users')
        // axios.get('http://localhost:8083/menu/member/'+'phpond'+'/menu')
            .then(res => {
                console.log(res);
                this.setState({menus: res.data});
            })
    }

    newRecipe(){
        browserHistory.push("/addmenu");
    }

    render() {
        return (
            <div>
                <HeaderMember/>

                <div className="site-content">
                    <div className="wrapper-detail">
                        <h3 className="align-center">My Menu</h3>
                        <div className="add-btn" onClick={this.newRecipe}>
                            <button><i className="fa fa-plus"></i> Add New</button>
                        </div>

                        <br></br>
                        <hr></hr>

                            <div className="row">
                                {this.state.menus.map(menus => (
                                <a className="column white" href="/editmenu">
                                    <h2>Tum Yum Kung | {menus.id}</h2>
                                    {/*<h2>{menus.foodName}</h2>*/}
                                    <figure className="space-line">
                                        <img width="294" height="196"
                                             src="https://img.lezizyemeklerim.com/tarif/5578/limonata-tarifi_b1dc05859381615b8854ff374da0fcc9/343x229.jpg"/>
                                    </figure>
                                    <div className="other_details space-line">
                                        <div className="likes">
                                            <i className="fa fa-heart"></i> Hard
                                        </div>
                                        <div className="user">
                                            <h7>{menus.username}</h7>
                                        </div>
                                    </div>
                                </a>
                                ))}
                            </div>
                    </div>
                </div>
            </div>
        );
    }
}
export default MymenuApp;