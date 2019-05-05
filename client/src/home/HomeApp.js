import React, {Component} from 'react';
import HeaderGuest from '../HeaderGuest';
import Content from '../Content';

class HomeApp extends Component {
    render() {
        return (
            <div>
                <header className="top">
                    <HeaderGuest/>
                </header>

                <body>
                    <Content/>
                </body>
            </div>
        );
    }
}

export default HomeApp;