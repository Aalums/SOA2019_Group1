import React, {Component} from 'react';
import HeaderGuest from '../HeaderGuest';
import Content from '../Content';

class HomeApp extends Component {
    render() {
        return (
            <div>
                <HeaderGuest/>

                <Content/>

            </div>
        );
    }
}

export default HomeApp;