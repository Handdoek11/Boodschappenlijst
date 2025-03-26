package J5;

import I5.AbstractC0630d;
import I5.C0628b;
import I5.v;
import J5.b;
import J6.AbstractC0650j;
import J6.r;
import S6.d;
import S6.h;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/* loaded from: classes2.dex */
public final class c extends b.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f3539a;

    /* renamed from: b, reason: collision with root package name */
    private final C0628b f3540b;

    /* renamed from: c, reason: collision with root package name */
    private final v f3541c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f3542d;

    public /* synthetic */ c(String str, C0628b c0628b, v vVar, int i8, AbstractC0650j abstractC0650j) {
        this(str, c0628b, (i8 & 4) != 0 ? null : vVar);
    }

    @Override // J5.b
    public Long a() {
        return Long.valueOf(this.f3542d.length);
    }

    @Override // J5.b
    public C0628b b() {
        return this.f3540b;
    }

    @Override // J5.b.a
    public byte[] d() {
        return this.f3542d;
    }

    public String toString() {
        return "TextContent[" + b() + "] \"" + h.C0(this.f3539a, 30) + '\"';
    }

    public c(String str, C0628b c0628b, v vVar) {
        byte[] g8;
        r.e(str, "text");
        r.e(c0628b, "contentType");
        this.f3539a = str;
        this.f3540b = c0628b;
        this.f3541c = vVar;
        Charset a8 = AbstractC0630d.a(b());
        a8 = a8 == null ? d.f5130b : a8;
        if (r.a(a8, d.f5130b)) {
            g8 = h.p(str);
        } else {
            CharsetEncoder newEncoder = a8.newEncoder();
            r.d(newEncoder, "charset.newEncoder()");
            g8 = W5.a.g(newEncoder, str, 0, str.length());
        }
        this.f3542d = g8;
    }
}
