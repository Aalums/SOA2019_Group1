import React, {Component} from 'react';
import {browserHistory} from "react-router";

import HeaderGuest from '../HeaderGuest';
import '../css/login.css';

class LoginApp extends Component {

    constructor() {
        super();
        this.loginHandle = this.loginHandle.bind(this);
    }

    loginHandle(){
        browserHistory.push("/member/menu");
    }

    render() {
        return (
            <div>
                <header>
                    <HeaderGuest/>
                </header>

                <div className="wrapper fadeInDown">
                    <div id="formContent">
                        <h2 className="login-regis"><a className="active" href="/login"> Login </a></h2>
                        <h2 className="login-regis"><a className="inactive underlineHover" href="/register"> Register </a></h2>
                        <form onSubmit={this.loginHandle}>
                            <input type="text" id="login" className="fadeIn second" name="login" placeholder="email"/>
                            <input type="password" id="password" className="fadeIn third" name="login"
                                   placeholder="password"/>
                            <input type="submit" className="fadeIn fourth" value="Log In"/>
                        </form>
                    </div>
                </div>
            </div>
        );
    }
}

export default LoginApp;