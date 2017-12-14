package model;

import presenter.Presenter;

public class Model {


    private Presenter presenter;
    private Ampelphase phase;
    private Logger logger;

    public Model(Presenter presenter) {
        this.presenter = presenter;
        phase = Ampelphase.ROT;
        presenter.setAmpelzustand(phase);
        logger = new FileLogger();
    }

    public void weiter() {

        switch (phase) {
            case ROT:
                phase = Ampelphase.ROTGELB;


                break;
            case ROTGELB:
                phase = Ampelphase.GRUEN;

                break;
            case GRUEN:
                phase = Ampelphase.GELB;

                break;
            case GELB:
                phase = Ampelphase.ROT;

        }
        presenter.setAmpelzustand(phase);

        //Zeit und Ampelphase mitloggen
        logger.log(phase);

    }
}