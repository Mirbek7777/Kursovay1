package ru.netology.graphics.image;

public class GreyTextColourSchemaImpl implements TextColorSchema {

    @Override
    public char convert(int color) {
        final char[] characterBase = {'#', '$', '@', '%', '*', '+', '-', '\''};
        return characterBase[Math.round(color * characterBase.length / 256)];
    }
}
