import React from 'react';
import ReactDOM from 'react-dom';

import HomeApp from './home/HomeApp';

import {Router, Route, browserHistory} from 'react-router';
import * as serviceWorker from './serviceWorker';

ReactDOM.render(
    <Router history={browserHistory}>
        <Route path="/" component={HomeApp}/>
        <Route path="/home" component={HomeApp}/>
    </Router>, document.getElementById('root')
);

serviceWorker.unregister();
