package presenter;

import model.Ampelphase;
import model.Model;
import view.PassiveView;

public class Presenter {

    private Model model;
    private PassiveView view;


    public Presenter(PassiveView view) {
        this.view = view;
        model = new Model(this);
    }

    public void weiter() {
        model.weiter();

    }

    public void setAmpelzustand(Ampelphase phase) {
        switch (phase) {
            case ROT:
                view.rotAn();
                view.gelbAus();
                view.gruenAus();

                break;

            case ROTGELB:
                view.rotAn();
                view.gelbAn();
                view.gruenAus();

                break;

            case GELB:
                view.rotAus();
                view.gelbAn();
                view.gruenAus();

                break;

            case GRUEN:
                view.rotAus();
                view.gelbAus();
                view.grueAn();
        }
    }

}
