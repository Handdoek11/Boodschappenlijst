package t5;

import java.security.SecureRandom;
import java.util.Random;

/* renamed from: t5.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6804f {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f43919a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray();

    /* renamed from: b, reason: collision with root package name */
    private static final Random f43920b = new SecureRandom();

    public static String a() {
        char[] cArr = new char[22];
        for (int i8 = 0; i8 < 22; i8++) {
            Random random = f43920b;
            char[] cArr2 = f43919a;
            cArr[i8] = cArr2[random.nextInt(cArr2.length)];
        }
        return new String(cArr);
    }
}
