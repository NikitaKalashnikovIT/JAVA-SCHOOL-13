package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Neil Alishev
 */
@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;
//@Qualifier указывает к какому id  бина нужно обращаться.По умолчанию
//после @Qualifier нужно указывать имя класса с маленькой буквы. Над объявлением
// используемого класса должна стоять аннотация @Component для связи с ним.
// если не указывать @Qualifier то @Autowired не поймет к какомк бину
//он относится так как классы RockMusic и ClassicalMusic имплементированны
// от одного интерфейса Music
    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic() {
        return "Playing: " + music1.getSong() + ", " + music2.getSong();
    }
}
