import React, {Component} from 'react';
import './css/header.css';
import axios from "axios";

class HeaderMember extends Component {

    state = {
        user: ""
    }

    componentDidMount() {
        axios.get('https://jsonplaceholder.typicode.com/users/1')
        // axios.get('http://localhost:8080//Member/{memberId}')
            .then(res => {
                console.log(res);
                this.setState({user: res.data.username});
            })
            .catch(error => {
                console.log(error);
            });
    }

    render() {
        return (
            <div>
                <header>
                    <div className="menu">
                        <div className="logo"><a href="/home">RECIPE</a></div>
                        <div className="navbar">
                            <div className="nav-items">
                                <ul>
                                    <li><a href="/home">Home</a></li>
                                    <li><a href="#">Contact</a></li>
                                    <li>
                                        <div className="drop1">
                                            <input type="checkbox" id="drop1"/>
                                            <label htmlFor="drop1"><a>{this.state.user}{/*this.state.user*/}
                                                <i className="material-icons">keyboard_arrow_down</i></a></label>
                                            <div className="drop-menu">
                                                <a href="/member/menu">My Menu</a>
                                                <a href="/addmenu">Add Menu</a>
                                                <a href="/home">Logout</a>
                                            </div>
                                        </div>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </header>
            </div>
        );
    }
}

export default HeaderMember;