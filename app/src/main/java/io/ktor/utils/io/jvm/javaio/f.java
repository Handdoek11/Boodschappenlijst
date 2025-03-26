package io.ktor.utils.io.jvm.javaio;

/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f36945a = new ThreadLocal();

    public static final e a() {
        e eVar = (e) f36945a.get();
        return eVar == null ? c.f36934a : eVar;
    }

    public static final boolean b() {
        return a() != g.f36946a;
    }
}
