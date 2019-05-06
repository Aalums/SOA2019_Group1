import React, {Component} from 'react';
import HeaderMember from '../HeaderMember';
import ManageMenuApp from './ManageMenuApp';

class ManageMenu extends Component {
    render() {
        return (
            <div>
                <HeaderMember/>

                <ManageMenuApp/>

            </div>
        );
    }
}

export default ManageMenu;