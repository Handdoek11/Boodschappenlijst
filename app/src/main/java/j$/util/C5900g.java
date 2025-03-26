package j$.util;

import java.io.Serializable;

/* renamed from: j$.util.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5900g extends RuntimeException {
    public static void a(String str, Serializable serializable) {
        throw new C5900g("Unsupported " + str + " :" + serializable);
    }
}
