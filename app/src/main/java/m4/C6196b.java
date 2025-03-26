package m4;

import java.io.File;
import p4.AbstractC6384F;

/* renamed from: m4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C6196b extends B {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC6384F f39032a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39033b;

    /* renamed from: c, reason: collision with root package name */
    private final File f39034c;

    C6196b(AbstractC6384F abstractC6384F, String str, File file) {
        if (abstractC6384F == null) {
            throw new NullPointerException("Null report");
        }
        this.f39032a = abstractC6384F;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f39033b = str;
        if (file == null) {
            throw new NullPointerException("Null reportFile");
        }
        this.f39034c = file;
    }

    @Override // m4.B
    public AbstractC6384F b() {
        return this.f39032a;
    }

    @Override // m4.B
    public File c() {
        return this.f39034c;
    }

    @Override // m4.B
    public String d() {
        return this.f39033b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b8 = (B) obj;
        return this.f39032a.equals(b8.b()) && this.f39033b.equals(b8.d()) && this.f39034c.equals(b8.c());
    }

    public int hashCode() {
        return ((((this.f39032a.hashCode() ^ 1000003) * 1000003) ^ this.f39033b.hashCode()) * 1000003) ^ this.f39034c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f39032a + ", sessionId=" + this.f39033b + ", reportFile=" + this.f39034c + "}";
    }
}
