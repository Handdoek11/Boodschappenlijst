package com.google.android.gms.internal.ads;

import G2.InterfaceC0611r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class TN {

    /* renamed from: e, reason: collision with root package name */
    private final String f19117e;

    /* renamed from: f, reason: collision with root package name */
    private final NN f19118f;

    /* renamed from: b, reason: collision with root package name */
    private final List f19114b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f19115c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f19116d = false;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0611r0 f19113a = C2.v.s().j();

    public TN(String str, NN nn) {
        this.f19117e = str;
        this.f19118f = nn;
    }

    private final Map g() {
        Map i8 = this.f19118f.i();
        i8.put("tms", Long.toString(C2.v.c().b(), 10));
        i8.put("tid", this.f19113a.L() ? "" : this.f19117e);
        return i8;
    }

    public final synchronized void a(String str) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23904h2)).booleanValue()) {
            Map g8 = g();
            g8.put("action", "aaia");
            g8.put("aair", "MalformedJson");
            this.f19114b.add(g8);
        }
    }

    public final synchronized void b(String str, String str2) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23904h2)).booleanValue()) {
            Map g8 = g();
            g8.put("action", "adapter_init_finished");
            g8.put("ancn", str);
            g8.put("rqe", str2);
            this.f19114b.add(g8);
        }
    }

    public final synchronized void c(String str) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23904h2)).booleanValue()) {
            Map g8 = g();
            g8.put("action", "adapter_init_started");
            g8.put("ancn", str);
            this.f19114b.add(g8);
        }
    }

    public final synchronized void d(String str) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23904h2)).booleanValue()) {
            Map g8 = g();
            g8.put("action", "adapter_init_finished");
            g8.put("ancn", str);
            this.f19114b.add(g8);
        }
    }

    public final synchronized void e() {
        try {
            if (((Boolean) D2.A.c().a(AbstractC3184kf.f23904h2)).booleanValue() && !this.f19116d) {
                Map g8 = g();
                g8.put("action", "init_finished");
                this.f19114b.add(g8);
                Iterator it = this.f19114b.iterator();
                while (it.hasNext()) {
                    this.f19118f.g((Map) it.next());
                }
                this.f19116d = true;
            }
        } finally {
        }
    }

    public final synchronized void f() {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23904h2)).booleanValue() && !this.f19115c) {
            Map g8 = g();
            g8.put("action", "init_started");
            this.f19114b.add(g8);
            this.f19115c = true;
        }
    }
}
