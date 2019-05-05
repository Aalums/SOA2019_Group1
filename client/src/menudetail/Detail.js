import React from 'react';
import ReactDOM from 'react-dom';
import DetailApp from './DetailApp';
import * as serviceWorker from '../serviceWorker';

ReactDOM.render(
    <DetailApp/>,
    document.getElementById('detail')
);

serviceWorker.unregister();