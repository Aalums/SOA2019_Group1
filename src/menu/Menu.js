import React from 'react';
import ReactDOM from 'react-dom';
import MenuApp from './MenuApp';
import * as serviceWorker from '../serviceWorker';

ReactDOM.render(
    <MenuApp/>,
    document.getElementById('menu')
);

serviceWorker.unregister();