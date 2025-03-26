package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import d2.AbstractC5710l;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f12957e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f12958f;

    /* renamed from: g, reason: collision with root package name */
    private static final File f12959g;

    /* renamed from: h, reason: collision with root package name */
    private static volatile y f12960h;

    /* renamed from: b, reason: collision with root package name */
    private int f12962b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f12963c = true;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f12964d = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    private final int f12961a = 20000;

    static {
        int i8 = Build.VERSION.SDK_INT;
        f12957e = i8 < 29;
        f12958f = i8 >= 28;
        f12959g = new File("/proc/self/fd");
    }

    y() {
    }

    private boolean a() {
        return f12957e && !this.f12964d.get();
    }

    public static y b() {
        if (f12960h == null) {
            synchronized (y.class) {
                try {
                    if (f12960h == null) {
                        f12960h = new y();
                    }
                } finally {
                }
            }
        }
        return f12960h;
    }

    private int c() {
        if (e()) {
            return 500;
        }
        return this.f12961a;
    }

    private synchronized boolean d() {
        try {
            boolean z7 = true;
            int i8 = this.f12962b + 1;
            this.f12962b = i8;
            if (i8 >= 50) {
                this.f12962b = 0;
                int length = f12959g.list().length;
                long c8 = c();
                if (length >= c8) {
                    z7 = false;
                }
                this.f12963c = z7;
                if (!z7 && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + c8);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f12963c;
    }

    private static boolean e() {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
        while (it.hasNext()) {
            if (Build.MODEL.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public boolean f(int i8, int i9, boolean z7, boolean z8) {
        if (!z7) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        }
        if (!f12958f) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        }
        if (a()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        }
        if (z8) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        if (i8 < 0 || i9 < 0) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
            }
            return false;
        }
        if (d()) {
            return true;
        }
        if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
        }
        return false;
    }

    boolean g(int i8, int i9, BitmapFactory.Options options, boolean z7, boolean z8) {
        boolean f8 = f(i8, i9, z7, z8);
        if (f8) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return f8;
    }

    public void h() {
        AbstractC5710l.a();
        this.f12964d.set(true);
    }
}
