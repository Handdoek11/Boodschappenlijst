package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.e;

/* loaded from: classes.dex */
public class m extends e implements SubMenu {

    /* renamed from: B, reason: collision with root package name */
    private e f7254B;

    /* renamed from: C, reason: collision with root package name */
    private g f7255C;

    public m(Context context, e eVar, g gVar) {
        super(context);
        this.f7254B = eVar;
        this.f7255C = gVar;
    }

    @Override // androidx.appcompat.view.menu.e
    public e D() {
        return this.f7254B.D();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean G() {
        return this.f7254B.G();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean H() {
        return this.f7254B.H();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean I() {
        return this.f7254B.I();
    }

    @Override // androidx.appcompat.view.menu.e
    public void S(e.a aVar) {
        this.f7254B.S(aVar);
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean f(g gVar) {
        return this.f7254B.f(gVar);
    }

    public Menu f0() {
        return this.f7254B;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f7255C;
    }

    @Override // androidx.appcompat.view.menu.e
    boolean h(e eVar, MenuItem menuItem) {
        return super.h(eVar, menuItem) || this.f7254B.h(eVar, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean k(g gVar) {
        return this.f7254B.k(gVar);
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public void setGroupDividerEnabled(boolean z7) {
        this.f7254B.setGroupDividerEnabled(z7);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.W(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.Z(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.a0(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f7255C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public void setQwertyMode(boolean z7) {
        this.f7254B.setQwertyMode(z7);
    }

    @Override // androidx.appcompat.view.menu.e
    public String t() {
        g gVar = this.f7255C;
        int itemId = gVar != null ? gVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.t() + ":" + itemId;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i8) {
        return (SubMenu) super.V(i8);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i8) {
        return (SubMenu) super.Y(i8);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i8) {
        this.f7255C.setIcon(i8);
        return this;
    }
}
