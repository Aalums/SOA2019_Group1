import React, {Component} from 'react';
import HeaderGuest from '../HeaderGuest';
import DetailContent from './DetailContent';

class DetailApp extends Component {
    render() {
        return (
            <div>
                <HeaderGuest/>

                <DetailContent/>

            </div>
        );
    }
}

export default DetailApp;