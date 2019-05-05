import React from 'react';
import ReactDOM from 'react-dom';
import registerApp from './RegisterApp';
import * as serviceWorker from '../serviceWorker';

ReactDOM.render(
    <registerApp/>,
    document.getElementById('register')
);

serviceWorker.unregister();