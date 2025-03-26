package com.bumptech.glide.manager;

import android.util.Log;
import d2.AbstractC5710l;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private final Set f12996a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    private final Set f12997b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private boolean f12998c;

    public boolean a(Z1.c cVar) {
        boolean z7 = true;
        if (cVar == null) {
            return true;
        }
        boolean remove = this.f12996a.remove(cVar);
        if (!this.f12997b.remove(cVar) && !remove) {
            z7 = false;
        }
        if (z7) {
            cVar.clear();
        }
        return z7;
    }

    public void b() {
        Iterator it = AbstractC5710l.j(this.f12996a).iterator();
        while (it.hasNext()) {
            a((Z1.c) it.next());
        }
        this.f12997b.clear();
    }

    public void c() {
        this.f12998c = true;
        for (Z1.c cVar : AbstractC5710l.j(this.f12996a)) {
            if (cVar.isRunning() || cVar.l()) {
                cVar.clear();
                this.f12997b.add(cVar);
            }
        }
    }

    public void d() {
        this.f12998c = true;
        for (Z1.c cVar : AbstractC5710l.j(this.f12996a)) {
            if (cVar.isRunning()) {
                cVar.e();
                this.f12997b.add(cVar);
            }
        }
    }

    public void e() {
        for (Z1.c cVar : AbstractC5710l.j(this.f12996a)) {
            if (!cVar.l() && !cVar.j()) {
                cVar.clear();
                if (this.f12998c) {
                    this.f12997b.add(cVar);
                } else {
                    cVar.k();
                }
            }
        }
    }

    public void f() {
        this.f12998c = false;
        for (Z1.c cVar : AbstractC5710l.j(this.f12996a)) {
            if (!cVar.l() && !cVar.isRunning()) {
                cVar.k();
            }
        }
        this.f12997b.clear();
    }

    public void g(Z1.c cVar) {
        this.f12996a.add(cVar);
        if (!this.f12998c) {
            cVar.k();
            return;
        }
        cVar.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f12997b.add(cVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f12996a.size() + ", isPaused=" + this.f12998c + "}";
    }
}
