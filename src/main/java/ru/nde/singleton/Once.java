package ru.nde.singleton;


/**
 * @author: Dmitriy E. Nosov <br>
 * @date: 14.03.14 14:28 <br>
 * @description: Правильный синглтон<br>
 */
public class Once {

    private String body;

    /**
     * Закрываем конструктор
     */
    private Once(final String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public static Once getInstance() {
        // в этом месте все потоки запрашивающие инстанс будут ждать пока ClassLoader загрузит и
        // создаст класс OnceInstanceHolder
        return Once.OnceInstanceHolder.INSTANCE;
    }

    public static class OnceInstanceHolder {

        private static final Once INSTANCE = new Once("single");

        private OnceInstanceHolder() {
        }

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Once{");
        sb.append("body='").append(body).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
