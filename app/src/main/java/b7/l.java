package b7;

import Z6.F;
import Z6.H;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12054a = F.e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* renamed from: b, reason: collision with root package name */
    public static final long f12055b = H.f("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f12056c = H.e("kotlinx.coroutines.scheduler.core.pool.size", P6.m.c(F.a(), 2), 1, 0, 8, null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f12057d = H.e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);

    /* renamed from: e, reason: collision with root package name */
    public static final long f12058e = TimeUnit.SECONDS.toNanos(H.f("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, null));

    /* renamed from: f, reason: collision with root package name */
    public static g f12059f = e.f12044a;

    /* renamed from: g, reason: collision with root package name */
    public static final i f12060g = new j(0);

    /* renamed from: h, reason: collision with root package name */
    public static final i f12061h = new j(1);
}
