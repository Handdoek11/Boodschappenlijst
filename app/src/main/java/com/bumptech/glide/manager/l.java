package com.bumptech.glide.manager;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.w;
import androidx.lifecycle.AbstractC0922h;
import com.bumptech.glide.manager.n;
import d2.AbstractC5710l;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
final class l {

    /* renamed from: a, reason: collision with root package name */
    final Map f12984a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final n.b f12985b;

    class a implements k {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ AbstractC0922h f12986o;

        a(AbstractC0922h abstractC0922h) {
            this.f12986o = abstractC0922h;
        }

        @Override // com.bumptech.glide.manager.k
        public void a() {
        }

        @Override // com.bumptech.glide.manager.k
        public void f() {
        }

        @Override // com.bumptech.glide.manager.k
        public void onDestroy() {
            l.this.f12984a.remove(this.f12986o);
        }
    }

    private final class b implements o {

        /* renamed from: a, reason: collision with root package name */
        private final w f12988a;

        b(w wVar) {
            this.f12988a = wVar;
        }

        private void b(w wVar, Set set) {
            List s02 = wVar.s0();
            int size = s02.size();
            for (int i8 = 0; i8 < size; i8++) {
                Fragment fragment = (Fragment) s02.get(i8);
                b(fragment.y(), set);
                com.bumptech.glide.k a8 = l.this.a(fragment.getLifecycle());
                if (a8 != null) {
                    set.add(a8);
                }
            }
        }

        @Override // com.bumptech.glide.manager.o
        public Set a() {
            HashSet hashSet = new HashSet();
            b(this.f12988a, hashSet);
            return hashSet;
        }
    }

    l(n.b bVar) {
        this.f12985b = bVar;
    }

    com.bumptech.glide.k a(AbstractC0922h abstractC0922h) {
        AbstractC5710l.a();
        return (com.bumptech.glide.k) this.f12984a.get(abstractC0922h);
    }

    com.bumptech.glide.k b(Context context, com.bumptech.glide.b bVar, AbstractC0922h abstractC0922h, w wVar, boolean z7) {
        AbstractC5710l.a();
        com.bumptech.glide.k a8 = a(abstractC0922h);
        if (a8 != null) {
            return a8;
        }
        LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(abstractC0922h);
        com.bumptech.glide.k a9 = this.f12985b.a(bVar, lifecycleLifecycle, new b(wVar), context);
        this.f12984a.put(abstractC0922h, a9);
        lifecycleLifecycle.a(new a(abstractC0922h));
        if (z7) {
            a9.a();
        }
        return a9;
    }
}
