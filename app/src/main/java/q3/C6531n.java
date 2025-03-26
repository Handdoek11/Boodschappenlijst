package q3;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* renamed from: q3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6531n {

    /* renamed from: a, reason: collision with root package name */
    private final Map f41892a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f41893b;

    /* renamed from: c, reason: collision with root package name */
    private final A4.c f41894c;

    C6531n(Map map, Map map2, A4.c cVar) {
        this.f41892a = map;
        this.f41893b = map2;
        this.f41894c = cVar;
    }

    public final byte[] a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C6507k(byteArrayOutputStream, this.f41892a, this.f41893b, this.f41894c).k(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
