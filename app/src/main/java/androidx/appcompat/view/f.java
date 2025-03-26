package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import java.util.ArrayList;
import q.C6407k;
import s0.InterfaceMenuC6720a;

/* loaded from: classes.dex */
public class f extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    final Context f7001a;

    /* renamed from: b, reason: collision with root package name */
    final b f7002b;

    public static class a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final ActionMode.Callback f7003a;

        /* renamed from: b, reason: collision with root package name */
        final Context f7004b;

        /* renamed from: c, reason: collision with root package name */
        final ArrayList f7005c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        final C6407k f7006d = new C6407k();

        public a(Context context, ActionMode.Callback callback) {
            this.f7004b = context;
            this.f7003a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = (Menu) this.f7006d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            k.d dVar = new k.d(this.f7004b, (InterfaceMenuC6720a) menu);
            this.f7006d.put(menu, dVar);
            return dVar;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(b bVar) {
            this.f7003a.onDestroyActionMode(e(bVar));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(b bVar, Menu menu) {
            return this.f7003a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(b bVar, Menu menu) {
            return this.f7003a.onPrepareActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(b bVar, MenuItem menuItem) {
            return this.f7003a.onActionItemClicked(e(bVar), new k.c(this.f7004b, (s0.b) menuItem));
        }

        public ActionMode e(b bVar) {
            int size = this.f7005c.size();
            for (int i8 = 0; i8 < size; i8++) {
                f fVar = (f) this.f7005c.get(i8);
                if (fVar != null && fVar.f7002b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f7004b, bVar);
            this.f7005c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f7001a = context;
        this.f7002b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f7002b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f7002b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new k.d(this.f7001a, (InterfaceMenuC6720a) this.f7002b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f7002b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f7002b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f7002b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f7002b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f7002b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f7002b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f7002b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f7002b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f7002b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f7002b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f7002b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z7) {
        this.f7002b.s(z7);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i8) {
        this.f7002b.n(i8);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i8) {
        this.f7002b.q(i8);
    }
}
