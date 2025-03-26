package d;

import J6.AbstractC0650j;
import J6.L;
import J6.r;
import J6.s;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.AbstractC0922h;
import androidx.lifecycle.InterfaceC0925k;
import androidx.lifecycle.InterfaceC0927m;
import e.AbstractC5734a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: h, reason: collision with root package name */
    private static final b f35163h = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final Map f35164a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f35165b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map f35166c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    private final List f35167d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final transient Map f35168e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    private final Map f35169f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f35170g = new Bundle();

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final d.b f35171a;

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC5734a f35172b;

        public a(d.b bVar, AbstractC5734a abstractC5734a) {
            r.e(bVar, "callback");
            r.e(abstractC5734a, "contract");
            this.f35171a = bVar;
            this.f35172b = abstractC5734a;
        }

        public final d.b a() {
            return this.f35171a;
        }

        public final AbstractC5734a b() {
            return this.f35172b;
        }
    }

    private static final class b {
        public /* synthetic */ b(AbstractC0650j abstractC0650j) {
            this();
        }

        private b() {
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC0922h f35173a;

        /* renamed from: b, reason: collision with root package name */
        private final List f35174b;

        public c(AbstractC0922h abstractC0922h) {
            r.e(abstractC0922h, "lifecycle");
            this.f35173a = abstractC0922h;
            this.f35174b = new ArrayList();
        }

        public final void a(InterfaceC0925k interfaceC0925k) {
            r.e(interfaceC0925k, "observer");
            this.f35173a.a(interfaceC0925k);
            this.f35174b.add(interfaceC0925k);
        }

        public final void b() {
            Iterator it = this.f35174b.iterator();
            while (it.hasNext()) {
                this.f35173a.c((InterfaceC0925k) it.next());
            }
            this.f35174b.clear();
        }
    }

    static final class d extends s implements I6.a {

        /* renamed from: o, reason: collision with root package name */
        public static final d f35175o = new d();

        d() {
            super(0);
        }

        @Override // I6.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(N6.c.f4202o.d(2147418112) + 65536);
        }
    }

    /* renamed from: d.e$e, reason: collision with other inner class name */
    public static final class C0247e extends d.c {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f35177b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC5734a f35178c;

        C0247e(String str, AbstractC5734a abstractC5734a) {
            this.f35177b = str;
            this.f35178c = abstractC5734a;
        }

        @Override // d.c
        public void b(Object obj, androidx.core.app.c cVar) {
            Object obj2 = e.this.f35165b.get(this.f35177b);
            AbstractC5734a abstractC5734a = this.f35178c;
            if (obj2 != null) {
                int intValue = ((Number) obj2).intValue();
                e.this.f35167d.add(this.f35177b);
                try {
                    e.this.i(intValue, this.f35178c, obj, cVar);
                    return;
                } catch (Exception e8) {
                    e.this.f35167d.remove(this.f35177b);
                    throw e8;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC5734a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // d.c
        public void c() {
            e.this.p(this.f35177b);
        }
    }

    public static final class f extends d.c {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f35180b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC5734a f35181c;

        f(String str, AbstractC5734a abstractC5734a) {
            this.f35180b = str;
            this.f35181c = abstractC5734a;
        }

        @Override // d.c
        public void b(Object obj, androidx.core.app.c cVar) {
            Object obj2 = e.this.f35165b.get(this.f35180b);
            AbstractC5734a abstractC5734a = this.f35181c;
            if (obj2 != null) {
                int intValue = ((Number) obj2).intValue();
                e.this.f35167d.add(this.f35180b);
                try {
                    e.this.i(intValue, this.f35181c, obj, cVar);
                    return;
                } catch (Exception e8) {
                    e.this.f35167d.remove(this.f35180b);
                    throw e8;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC5734a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // d.c
        public void c() {
            e.this.p(this.f35180b);
        }
    }

    private final void d(int i8, String str) {
        this.f35164a.put(Integer.valueOf(i8), str);
        this.f35165b.put(str, Integer.valueOf(i8));
    }

    private final void g(String str, int i8, Intent intent, a aVar) {
        if ((aVar != null ? aVar.a() : null) == null || !this.f35167d.contains(str)) {
            this.f35169f.remove(str);
            this.f35170g.putParcelable(str, new C5694a(i8, intent));
        } else {
            aVar.a().a(aVar.b().c(i8, intent));
            this.f35167d.remove(str);
        }
    }

    private final int h() {
        for (Number number : R6.g.e(d.f35175o)) {
            if (!this.f35164a.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(e eVar, String str, d.b bVar, AbstractC5734a abstractC5734a, InterfaceC0927m interfaceC0927m, AbstractC0922h.a aVar) {
        r.e(eVar, "this$0");
        r.e(str, "$key");
        r.e(bVar, "$callback");
        r.e(abstractC5734a, "$contract");
        r.e(interfaceC0927m, "<anonymous parameter 0>");
        r.e(aVar, "event");
        if (AbstractC0922h.a.ON_START != aVar) {
            if (AbstractC0922h.a.ON_STOP == aVar) {
                eVar.f35168e.remove(str);
                return;
            } else {
                if (AbstractC0922h.a.ON_DESTROY == aVar) {
                    eVar.p(str);
                    return;
                }
                return;
            }
        }
        eVar.f35168e.put(str, new a(bVar, abstractC5734a));
        if (eVar.f35169f.containsKey(str)) {
            Object obj = eVar.f35169f.get(str);
            eVar.f35169f.remove(str);
            bVar.a(obj);
        }
        C5694a c5694a = (C5694a) v0.c.a(eVar.f35170g, str, C5694a.class);
        if (c5694a != null) {
            eVar.f35170g.remove(str);
            bVar.a(abstractC5734a.c(c5694a.b(), c5694a.a()));
        }
    }

    private final void o(String str) {
        if (((Integer) this.f35165b.get(str)) != null) {
            return;
        }
        d(h(), str);
    }

    public final boolean e(int i8, int i9, Intent intent) {
        String str = (String) this.f35164a.get(Integer.valueOf(i8));
        if (str == null) {
            return false;
        }
        g(str, i9, intent, (a) this.f35168e.get(str));
        return true;
    }

    public final boolean f(int i8, Object obj) {
        String str = (String) this.f35164a.get(Integer.valueOf(i8));
        if (str == null) {
            return false;
        }
        a aVar = (a) this.f35168e.get(str);
        if ((aVar != null ? aVar.a() : null) == null) {
            this.f35170g.remove(str);
            this.f35169f.put(str, obj);
            return true;
        }
        d.b a8 = aVar.a();
        r.c(a8, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (!this.f35167d.remove(str)) {
            return true;
        }
        a8.a(obj);
        return true;
    }

    public abstract void i(int i8, AbstractC5734a abstractC5734a, Object obj, androidx.core.app.c cVar);

    public final void j(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        if (stringArrayList2 != null) {
            this.f35167d.addAll(stringArrayList2);
        }
        Bundle bundle2 = bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        if (bundle2 != null) {
            this.f35170g.putAll(bundle2);
        }
        int size = stringArrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            String str = stringArrayList.get(i8);
            if (this.f35165b.containsKey(str)) {
                Integer num = (Integer) this.f35165b.remove(str);
                if (!this.f35170g.containsKey(str)) {
                    L.c(this.f35164a).remove(num);
                }
            }
            Integer num2 = integerArrayList.get(i8);
            r.d(num2, "rcs[i]");
            int intValue = num2.intValue();
            String str2 = stringArrayList.get(i8);
            r.d(str2, "keys[i]");
            d(intValue, str2);
        }
    }

    public final void k(Bundle bundle) {
        r.e(bundle, "outState");
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f35165b.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f35165b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f35167d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.f35170g));
    }

    public final d.c l(final String str, InterfaceC0927m interfaceC0927m, final AbstractC5734a abstractC5734a, final d.b bVar) {
        r.e(str, "key");
        r.e(interfaceC0927m, "lifecycleOwner");
        r.e(abstractC5734a, "contract");
        r.e(bVar, "callback");
        AbstractC0922h lifecycle = interfaceC0927m.getLifecycle();
        if (lifecycle.b().c(AbstractC0922h.b.STARTED)) {
            throw new IllegalStateException(("LifecycleOwner " + interfaceC0927m + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        o(str);
        c cVar = (c) this.f35166c.get(str);
        if (cVar == null) {
            cVar = new c(lifecycle);
        }
        cVar.a(new InterfaceC0925k() { // from class: d.d
            @Override // androidx.lifecycle.InterfaceC0925k
            public final void f(InterfaceC0927m interfaceC0927m2, AbstractC0922h.a aVar) {
                e.n(this.f35159o, str, bVar, abstractC5734a, interfaceC0927m2, aVar);
            }
        });
        this.f35166c.put(str, cVar);
        return new C0247e(str, abstractC5734a);
    }

    public final d.c m(String str, AbstractC5734a abstractC5734a, d.b bVar) {
        r.e(str, "key");
        r.e(abstractC5734a, "contract");
        r.e(bVar, "callback");
        o(str);
        this.f35168e.put(str, new a(bVar, abstractC5734a));
        if (this.f35169f.containsKey(str)) {
            Object obj = this.f35169f.get(str);
            this.f35169f.remove(str);
            bVar.a(obj);
        }
        C5694a c5694a = (C5694a) v0.c.a(this.f35170g, str, C5694a.class);
        if (c5694a != null) {
            this.f35170g.remove(str);
            bVar.a(abstractC5734a.c(c5694a.b(), c5694a.a()));
        }
        return new f(str, abstractC5734a);
    }

    public final void p(String str) {
        Integer num;
        r.e(str, "key");
        if (!this.f35167d.contains(str) && (num = (Integer) this.f35165b.remove(str)) != null) {
            this.f35164a.remove(num);
        }
        this.f35168e.remove(str);
        if (this.f35169f.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f35169f.get(str));
            this.f35169f.remove(str);
        }
        if (this.f35170g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((C5694a) v0.c.a(this.f35170g, str, C5694a.class)));
            this.f35170g.remove(str);
        }
        c cVar = (c) this.f35166c.get(str);
        if (cVar != null) {
            cVar.b();
            this.f35166c.remove(str);
        }
    }
}
