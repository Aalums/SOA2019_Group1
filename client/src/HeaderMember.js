import React, {Component} from 'react';
import './css/header.css';

class HeaderMember extends Component {
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
                                            <label htmlFor="drop1"><a>Profile
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