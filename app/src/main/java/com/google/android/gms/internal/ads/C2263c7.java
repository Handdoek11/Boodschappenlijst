package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.gms.internal.ads.c7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2263c7 implements T6 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f21077a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final J6 f21078b;

    /* renamed from: c, reason: collision with root package name */
    private final BlockingQueue f21079c;

    /* renamed from: d, reason: collision with root package name */
    private final N6 f21080d;

    C2263c7(J6 j62, BlockingQueue blockingQueue, N6 n62) {
        this.f21080d = n62;
        this.f21078b = j62;
        this.f21079c = blockingQueue;
    }

    @Override // com.google.android.gms.internal.ads.T6
    public final synchronized void a(U6 u62) {
        try {
            Map map = this.f21077a;
            String m8 = u62.m();
            List list = (List) map.remove(m8);
            if (list == null || list.isEmpty()) {
                return;
            }
            if (AbstractC2155b7.f20816b) {
                AbstractC2155b7.d("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), m8);
            }
            U6 u63 = (U6) list.remove(0);
            this.f21077a.put(m8, list);
            u63.z(this);
            try {
                this.f21079c.put(u63);
            } catch (InterruptedException e8) {
                AbstractC2155b7.b("Couldn't add request to queue. %s", e8.toString());
                Thread.currentThread().interrupt();
                this.f21078b.b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.T6
    public final void b(U6 u62, Y6 y62) {
        List list;
        G6 g62 = y62.f20211b;
        if (g62 == null || g62.a(System.currentTimeMillis())) {
            a(u62);
            return;
        }
        String m8 = u62.m();
        synchronized (this) {
            list = (List) this.f21077a.remove(m8);
        }
        if (list != null) {
            if (AbstractC2155b7.f20816b) {
                AbstractC2155b7.d("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), m8);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f21080d.b((U6) it.next(), y62, null);
            }
        }
    }

    final synchronized boolean c(U6 u62) {
        try {
            Map map = this.f21077a;
            String m8 = u62.m();
            if (!map.containsKey(m8)) {
                this.f21077a.put(m8, null);
                u62.z(this);
                if (AbstractC2155b7.f20816b) {
                    AbstractC2155b7.a("new request, sending to network %s", m8);
                }
                return false;
            }
            List list = (List) this.f21077a.get(m8);
            if (list == null) {
                list = new ArrayList();
            }
            u62.r("waiting-for-response");
            list.add(u62);
            this.f21077a.put(m8, list);
            if (AbstractC2155b7.f20816b) {
                AbstractC2155b7.a("Request for cacheKey=%s is in flight, putting on hold.", m8);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
