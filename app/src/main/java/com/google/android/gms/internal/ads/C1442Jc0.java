package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.internal.ads.Jc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1442Jc0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1404Ib0 f16276a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicLong f16277b = new AtomicLong();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque f16278c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    private final PriorityQueue f16279d = new PriorityQueue();

    /* renamed from: e, reason: collision with root package name */
    private int f16280e = -1;

    public C1442Jc0(InterfaceC1404Ib0 interfaceC1404Ib0) {
        this.f16276a = interfaceC1404Ib0;
    }

    private final void e(int i8) {
        while (this.f16279d.size() > i8) {
            C2963ic0 c2963ic0 = (C2963ic0) this.f16279d.poll();
            int i9 = AbstractC2301cW.f21206a;
            this.f16276a.a(c2963ic0.f23004s, c2963ic0.f23003o);
            this.f16278c.push(c2963ic0);
        }
    }

    public final int a() {
        return this.f16280e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (r9 < r0.f23004s) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(long r9, com.google.android.gms.internal.ads.UQ r11) {
        /*
            r8 = this;
            int r0 = r8.f16280e
            if (r0 == 0) goto L53
            r1 = -1
            if (r0 == r1) goto L24
            java.util.PriorityQueue r0 = r8.f16279d
            int r0 = r0.size()
            int r2 = r8.f16280e
            if (r0 < r2) goto L24
            java.util.PriorityQueue r0 = r8.f16279d
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.ic0 r0 = (com.google.android.gms.internal.ads.C2963ic0) r0
            int r2 = com.google.android.gms.internal.ads.AbstractC2301cW.f21206a
            long r2 = com.google.android.gms.internal.ads.C2963ic0.a(r0)
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 >= 0) goto L24
            goto L53
        L24:
            java.util.ArrayDeque r0 = r8.f16278c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L32
            com.google.android.gms.internal.ads.ic0 r0 = new com.google.android.gms.internal.ads.ic0
            r0.<init>()
            goto L3a
        L32:
            java.util.ArrayDeque r0 = r8.f16278c
            java.lang.Object r0 = r0.poll()
            com.google.android.gms.internal.ads.ic0 r0 = (com.google.android.gms.internal.ads.C2963ic0) r0
        L3a:
            java.util.concurrent.atomic.AtomicLong r2 = r8.f16277b
            long r5 = r2.getAndIncrement()
            r2 = r0
            r3 = r9
            r7 = r11
            r2.f(r3, r5, r7)
            java.util.PriorityQueue r9 = r8.f16279d
            r9.add(r0)
            int r9 = r8.f16280e
            if (r9 == r1) goto L52
            r8.e(r9)
        L52:
            return
        L53:
            com.google.android.gms.internal.ads.Ib0 r0 = r8.f16276a
            r0.a(r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1442Jc0.b(long, com.google.android.gms.internal.ads.UQ):void");
    }

    public final void c() {
        e(0);
    }

    public final void d(int i8) {
        AbstractC3796qC.f(i8 >= 0);
        this.f16280e = i8;
        e(i8);
    }
}
