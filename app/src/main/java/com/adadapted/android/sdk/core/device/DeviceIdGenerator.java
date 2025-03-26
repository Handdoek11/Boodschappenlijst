package com.adadapted.android.sdk.core.device;

import P6.c;
import java.util.ArrayList;
import java.util.List;
import y6.AbstractC6987o;

/* loaded from: classes.dex */
public final class DeviceIdGenerator {
    public static final DeviceIdGenerator INSTANCE = new DeviceIdGenerator();
    private static final List<Character> IdCharacters = AbstractC6987o.M(new c('a', 'z'), new c('0', '9'));
    public static final int $stable = 8;

    private DeviceIdGenerator() {
    }

    public final String generateId() {
        ArrayList arrayList = new ArrayList(32);
        for (int i8 = 0; i8 < 32; i8++) {
            Character ch = (Character) AbstractC6987o.P(IdCharacters, N6.c.f4202o);
            ch.charValue();
            arrayList.add(ch);
        }
        return AbstractC6987o.I(arrayList, "", null, null, 0, null, null, 62, null);
    }
}
