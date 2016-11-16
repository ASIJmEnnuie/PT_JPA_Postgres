import React from 'react';
import PT_Event from './PT_Event';

const PT_EventList = React.createClass({
  getDefaultProps: function() {
    return {
      events: [],
    }
  },

  getInitialState: function() {
    return  {
      class: "eventList"
    }
  },

  render: function() {
    return (
      <div className={this.state.class}>
        {
          this.props.events.map(function(event, i){
            return(
              <PT_Event
                key={i}
                nom={event.nomEvt}
                lieu={event.lieuEvt}
                organisateur={event.orgaEvt}
                date={event.dateEvt}
                heure={event.heureEvt}
                description={event.descEvt}
                nbInscriptions={event.nbInscEvt}
                nbPlaces={event.nbPlacesEvt}
                image={event.imageEvt}
              />
            );
          })
        }
      </div>
    );
  }
});

export default PT_EventList;
