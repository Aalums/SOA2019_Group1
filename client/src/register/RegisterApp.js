import React, {Component} from 'react';
import HeaderGuest from '../HeaderGuest';
import '../css/login.css';

class RegisterApp extends Component {
    render() {
        return (
            <div>
                <header>
                    <HeaderGuest/>
                </header>

                <div className="wrapper fadeInDown">
                    <div id="formContent">
                        <h2 className="login-regis"><a className="inactive underlineHover" href="/login"> Login </a></h2>
                        <h2 className="login-regis"><a className="active" href="/register"> Register </a></h2>

                        <form>
                            <input type="text" id="login" className="fadeIn second" name="login" placeholder="username"/>
                            <input type="text" id="login" className="fadeIn second" name="login" placeholder="email"/>
                            <input type="password" id="password" className="fadeIn third" name="login"
                                   placeholder="password"/>
                            <input type="submit" className="fadeIn fourth" value="Register"/>
                        </form>
                    </div>
                </div>
            </div>
        );
    }
}

export default RegisterApp;