import React, {Component} from 'react';
import HeaderGuest from '../HeaderGuest';
import MenuContent from './MenuContent';

class MenuApp extends Component {
    render() {
        return (
            <div>
                <header>
                    <HeaderGuest/>
                </header>

                <MenuContent/>

            </div>
        );
    }
}

export default MenuApp;