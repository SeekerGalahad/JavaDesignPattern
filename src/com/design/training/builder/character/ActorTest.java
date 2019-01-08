package com.design.training.builder.character;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-08 15:18 by Wagic 创建
 */
public class ActorTest {

    public static void main(String[] args) {
        ActorBuilder heroBuilder = new HeroBuilder();
        ActorBuilder angleBuilder = new AngleBuilder();
        ActorBuilder devilBuilder = new DevilBuilder();

        ActorDirector actorDirector = new ActorDirector();

        Actor hero = actorDirector.constuct(heroBuilder);
        System.out.println(hero);

        Actor angle = actorDirector.constuct(angleBuilder);
        System.out.println(angle);

        Actor devil = actorDirector.constuct(devilBuilder);
        System.out.println(devil);

    }
}
