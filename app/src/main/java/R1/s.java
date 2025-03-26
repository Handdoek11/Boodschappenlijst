package r1;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: c, reason: collision with root package name */
    private static final Set f42392c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    private final String f42393a;

    /* renamed from: b, reason: collision with root package name */
    private final String f42394b;

    public static class a extends s {
        a(String str, String str2) {
            super(str, str2);
        }
    }

    public static class b extends s {
        b(String str, String str2) {
            super(str, str2);
        }
    }

    s(String str, String str2) {
        this.f42393a = str;
        this.f42394b = str2;
        f42392c.add(this);
    }
}
