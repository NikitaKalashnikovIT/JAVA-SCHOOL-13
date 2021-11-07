package ru.alishev.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Neil Alishev
 */
@Configuration//аннотация замещает xml айл инициализации
@PropertySource("classpath:musicPlayer.properties")//подключает файли с данными
public class SpringConfig {
    //@Bean аналог создания бина в xml только проще
    //classicalMusic id класса ClassicalMusic
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    //объявление зависимостей MusicPlayer(rockMusic(), classicalMusic())
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(rockMusic(), classicalMusic());
    }

    @Bean
    //объявление зависимостей Computer(musicPlayer())
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
