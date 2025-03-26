package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final long f32831b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f32832c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    private static h f32833d;

    /* renamed from: a, reason: collision with root package name */
    private final L4.a f32834a;

    private h(L4.a aVar) {
        this.f32834a = aVar;
    }

    public static h c() {
        return d(L4.b.b());
    }

    public static h d(L4.a aVar) {
        if (f32833d == null) {
            f32833d = new h(aVar);
        }
        return f32833d;
    }

    static boolean g(String str) {
        return f32832c.matcher(str).matches();
    }

    static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f32834a.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(J4.d dVar) {
        return TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + f32831b;
    }
}
