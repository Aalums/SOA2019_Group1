import React, {Component} from 'react';
import {browserHistory} from "react-router";

import HeaderMember from '../HeaderMember';
import '../css/mymenu.css'
import 'font-awesome/css/font-awesome.min.css';

class MymenuApp extends Component {

    constructor() {
        super();

        this.newRecipe = this.newRecipe.bind(this);
    }

    newRecipe(){
        browserHistory.push("/addmenu");
    }

    render() {
        return (
            <div>
                <header>
                    <HeaderMember/>
                </header>

                <div className="site-content">
                    <div className="wrapper-detail">
                        <h3 className="align-center">My Menu</h3>
                        <div id="add-new" className="add-btn" onClick={this.newRecipe}><i className="fa fa-plus"></i> Add New</div>

                        <div className="row">
                            <a className="column white" href="/menu/detail">
                                <h2>Tum Yum Kung</h2>
                                <figure className="space-line">
                                    <img width="294" height="196"
                                         src="https://img.lezizyemeklerim.com/tarif/5578/limonata-tarifi_b1dc05859381615b8854ff374da0fcc9/343x229.jpg"/>
                                </figure>
                                <div className="other_details space-line">
                                    <div className="view">
                                        <i className="fa fa-eye"></i> 13.2B
                                    </div>
                                    <div className="likes">
                                        <i className="fa fa-heart"></i> 120
                                    </div>
                                    <div className="user">
                                        <h7>Author name</h7>
                                    </div>
                                </div>
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}

export default MymenuApp;