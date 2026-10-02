public class RelogioAmericano extends Relogio {

    @Override
    public void ajustarHorario(Relogio relogio) {
            if (relogio.getHora() > 12){
                setHora(relogio.getHora() - 12);
            } else {
                setHora(relogio.getHora());
            }
        setMinuto(relogio.getMinuto());
        setSegundo(relogio.getSegundo());
    }
}
