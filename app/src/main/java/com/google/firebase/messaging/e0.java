package com.google.firebase.messaging;

import A3.AbstractC0376j;
import A3.AbstractC0379m;
import A3.C0377k;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import q.C6397a;

/* loaded from: classes2.dex */
class e0 {

    /* renamed from: i, reason: collision with root package name */
    private static final long f32956i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a, reason: collision with root package name */
    private final Context f32957a;

    /* renamed from: b, reason: collision with root package name */
    private final I f32958b;

    /* renamed from: c, reason: collision with root package name */
    private final D f32959c;

    /* renamed from: d, reason: collision with root package name */
    private final FirebaseMessaging f32960d;

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f32962f;

    /* renamed from: h, reason: collision with root package name */
    private final c0 f32964h;

    /* renamed from: e, reason: collision with root package name */
    private final Map f32961e = new C6397a();

    /* renamed from: g, reason: collision with root package name */
    private boolean f32963g = false;

    private e0(FirebaseMessaging firebaseMessaging, I i8, c0 c0Var, D d8, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f32960d = firebaseMessaging;
        this.f32958b = i8;
        this.f32964h = c0Var;
        this.f32959c = d8;
        this.f32957a = context;
        this.f32962f = scheduledExecutorService;
    }

    private static void b(AbstractC0376j abstractC0376j) {
        try {
            AbstractC0379m.b(abstractC0376j, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e8) {
            e = e8;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e9) {
            Throwable cause = e9.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e9);
            }
            throw ((RuntimeException) cause);
        } catch (TimeoutException e10) {
            e = e10;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    private void c(String str) {
        b(this.f32959c.m(this.f32960d.k(), str));
    }

    private void d(String str) {
        b(this.f32959c.n(this.f32960d.k(), str));
    }

    static AbstractC0376j e(final FirebaseMessaging firebaseMessaging, final I i8, final D d8, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return AbstractC0379m.c(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.d0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return e0.i(context, scheduledExecutorService, firebaseMessaging, i8, d8);
            }
        });
    }

    static boolean g() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e0 i(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, I i8, D d8) {
        return new e0(firebaseMessaging, i8, c0.a(context, scheduledExecutorService), d8, context, scheduledExecutorService);
    }

    private void j(b0 b0Var) {
        synchronized (this.f32961e) {
            try {
                String e8 = b0Var.e();
                if (this.f32961e.containsKey(e8)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.f32961e.get(e8);
                    C0377k c0377k = (C0377k) arrayDeque.poll();
                    if (c0377k != null) {
                        c0377k.c(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.f32961e.remove(e8);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void n() {
        if (h()) {
            return;
        }
        q(0L);
    }

    boolean f() {
        return this.f32964h.b() != null;
    }

    synchronized boolean h() {
        return this.f32963g;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean k(com.google.firebase.messaging.b0 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "FirebaseMessaging"
            r1 = 0
            java.lang.String r2 = r7.b()     // Catch: java.io.IOException -> L1f
            int r3 = r2.hashCode()     // Catch: java.io.IOException -> L1f
            r4 = 83
            r5 = 1
            if (r3 == r4) goto L22
            r4 = 85
            if (r3 == r4) goto L15
            goto L2c
        L15:
            java.lang.String r3 = "U"
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> L1f
            if (r2 == 0) goto L2c
            r2 = r5
            goto L2d
        L1f:
            r7 = move-exception
            goto La5
        L22:
            java.lang.String r3 = "S"
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> L1f
            if (r2 == 0) goto L2c
            r2 = r1
            goto L2d
        L2c:
            r2 = -1
        L2d:
            java.lang.String r3 = " succeeded."
            if (r2 == 0) goto L7c
            if (r2 == r5) goto L53
            boolean r2 = g()     // Catch: java.io.IOException -> L1f
            if (r2 == 0) goto La4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1f
            r2.<init>()     // Catch: java.io.IOException -> L1f
            java.lang.String r3 = "Unknown topic operation"
            r2.append(r3)     // Catch: java.io.IOException -> L1f
            r2.append(r7)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = "."
            r2.append(r7)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> L1f
            android.util.Log.d(r0, r7)     // Catch: java.io.IOException -> L1f
            goto La4
        L53:
            java.lang.String r2 = r7.c()     // Catch: java.io.IOException -> L1f
            r6.d(r2)     // Catch: java.io.IOException -> L1f
            boolean r2 = g()     // Catch: java.io.IOException -> L1f
            if (r2 == 0) goto La4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1f
            r2.<init>()     // Catch: java.io.IOException -> L1f
            java.lang.String r4 = "Unsubscribe from topic: "
            r2.append(r4)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = r7.c()     // Catch: java.io.IOException -> L1f
            r2.append(r7)     // Catch: java.io.IOException -> L1f
            r2.append(r3)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> L1f
            android.util.Log.d(r0, r7)     // Catch: java.io.IOException -> L1f
            goto La4
        L7c:
            java.lang.String r2 = r7.c()     // Catch: java.io.IOException -> L1f
            r6.c(r2)     // Catch: java.io.IOException -> L1f
            boolean r2 = g()     // Catch: java.io.IOException -> L1f
            if (r2 == 0) goto La4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1f
            r2.<init>()     // Catch: java.io.IOException -> L1f
            java.lang.String r4 = "Subscribe to topic: "
            r2.append(r4)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = r7.c()     // Catch: java.io.IOException -> L1f
            r2.append(r7)     // Catch: java.io.IOException -> L1f
            r2.append(r3)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> L1f
            android.util.Log.d(r0, r7)     // Catch: java.io.IOException -> L1f
        La4:
            return r5
        La5:
            java.lang.String r2 = "SERVICE_NOT_AVAILABLE"
            java.lang.String r3 = r7.getMessage()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Ld7
            java.lang.String r2 = "INTERNAL_SERVER_ERROR"
            java.lang.String r3 = r7.getMessage()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Ld7
            java.lang.String r2 = "TOO_MANY_SUBSCRIBERS"
            java.lang.String r3 = r7.getMessage()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Lca
            goto Ld7
        Lca:
            java.lang.String r2 = r7.getMessage()
            if (r2 != 0) goto Ld6
            java.lang.String r7 = "Topic operation failed without exception message. Will retry Topic operation."
            android.util.Log.e(r0, r7)
            return r1
        Ld6:
            throw r7
        Ld7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Topic operation failed: "
            r2.append(r3)
            java.lang.String r7 = r7.getMessage()
            r2.append(r7)
            java.lang.String r7 = ". Will retry Topic operation."
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            android.util.Log.e(r0, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.e0.k(com.google.firebase.messaging.b0):boolean");
    }

    void l(Runnable runnable, long j8) {
        this.f32962f.schedule(runnable, j8, TimeUnit.SECONDS);
    }

    synchronized void m(boolean z7) {
        this.f32963g = z7;
    }

    void o() {
        if (f()) {
            n();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (g() == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
    
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean p() {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            com.google.firebase.messaging.c0 r0 = r2.f32964h     // Catch: java.lang.Throwable -> L17
            com.google.firebase.messaging.b0 r0 = r0.b()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L1c
            boolean r0 = g()     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L19
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r0 = move-exception
            goto L2e
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            r0 = 1
            return r0
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            boolean r1 = r2.k(r0)
            if (r1 != 0) goto L25
            r0 = 0
            return r0
        L25:
            com.google.firebase.messaging.c0 r1 = r2.f32964h
            r1.d(r0)
            r2.j(r0)
            goto L0
        L2e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.e0.p():boolean");
    }

    void q(long j8) {
        l(new f0(this, this.f32957a, this.f32958b, Math.min(Math.max(30L, 2 * j8), f32956i)), j8);
        m(true);
    }
}
