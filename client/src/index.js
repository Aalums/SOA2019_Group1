import React from 'react';
import ReactDOM from 'react-dom';

import HomeApp from './home/HomeApp';
import LoginApp from "./login/LoginApp";
import RegisterApp from "./register/RegisterApp";
import MenuApp from "./menu/MenuApp";

import DetailApp from "./menudetail/DetailApp";

import {Router, Route, browserHistory} from 'react-router';
import * as serviceWorker from './serviceWorker';

ReactDOM.render(
    <Router history={browserHistory}>
        <Route path="/" component={HomeApp}/>
        <Route path="/home" component={HomeApp}/>
        <Route path="/login" component={LoginApp}/>
        <Route path="/register" component={RegisterApp}/>
        <Route path="type/menu" component={MenuApp}/>
        <Route path="/menu/detail" component={DetailApp}/>
    </Router>, document.getElementById('root')
);

serviceWorker.unregister();
