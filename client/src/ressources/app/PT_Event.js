import React from 'react';

const PT_Event = React.createClass({
  getInitialState: function() {
    return  {
      class: "event"
    }
  },

  render: function() {
    return (
      <section className={this.state.class}>
        <div className="content">
          <div className="colImage" >
            <img src={this.props.image_evt} alt="Une image de description"></img>
          </div>

          <div className="colInfo">

            <div className="col">
              <div className="row"><span className="title">{this.props.nom_evt}</span></div>
              <div className="row"><span>Le {this.props.date_evt} à {this.props.heure_evt}</span></div>
              <div className="row"><span>{this.props.lieu_evt}</span></div>
            </div>

            <div className="col">
              <div className="row"><span><span className="digit">{this.props.nb_insc_evt}</span> personne(s) inscrites</span></div>
              <div className="row"><span><span className="digit">{this.props.nb_places_evt}</span> place(s) restantes</span></div>
            </div>

            <div className="row">
              <span>{this.props.desc_evt}</span>
            </div>
          </div>
        </div>
      </section>
    );
  }
});

export default PT_Event;
