package classes;

public abstract class Character {
    private final int MAX_LIFE = 100,
            MAX_LEVEL = 100,
            MAX_EXPERIENCE = 100;

    private String name;
    private int life, level, experience;
    private boolean alive;

    public Character(String name) {
        setAlive(true);
        setName(name);
        setLife(MAX_LIFE);
        setLevel(0);
        setExperience(0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = Math.min(Math.max(life, 0), MAX_LIFE);
    }

    public void updateLife(int value) {
        setLife(life + value);
    }

    public void takeDamage(int value) {
        updateLife(-value);
        if (getLife() == 0)
            setAlive(false);
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = Math.min(Math.max(experience, 0), MAX_EXPERIENCE);
    }

    public void updateExperience(int value) {
        setExperience(experience + value);
    }

    public void addExperience(int value) {
        int experienceExceeded = experience + value - MAX_EXPERIENCE;
        if (experienceExceeded < 0)
            updateExperience(value);
        else {
            updateLevel(1);
            setExperience(experienceExceeded);
        }
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = Math.min(Math.max(level, 0), MAX_LEVEL);
    }

    public void updateLevel(int value) {
        setLevel(level + value);
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public abstract void attack(Character another);
}