import React from 'react';
import ReactDOM from 'react-dom';

import HomeApp from './home/HomeApp';

import MenuApp from "./menu/MenuApp";

import {Router, Route, browserHistory} from 'react-router';
import * as serviceWorker from './serviceWorker';

ReactDOM.render(
    <Router history={browserHistory}>
        <Route path="/" component={HomeApp}/>
        <Route path="/home" component={HomeApp}/>
        <Route path="type/menu" component={MenuApp}/>
    </Router>, document.getElementById('root')
);

serviceWorker.unregister();
