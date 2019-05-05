import React from 'react';
import ReactDOM from 'react-dom';
import LoginApp from './LoginApp';
import * as serviceWorker from '../serviceWorker';

ReactDOM.render(
    <LoginApp/>,
    document.getElementById('login')
);

serviceWorker.unregister();