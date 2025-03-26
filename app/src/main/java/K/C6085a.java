package k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import o0.AbstractC6278a;
import r0.AbstractC6641a;
import z0.AbstractC7015b;

/* renamed from: k.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6085a implements s0.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f38356a;

    /* renamed from: b, reason: collision with root package name */
    private final int f38357b;

    /* renamed from: c, reason: collision with root package name */
    private final int f38358c;

    /* renamed from: d, reason: collision with root package name */
    private CharSequence f38359d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f38360e;

    /* renamed from: f, reason: collision with root package name */
    private Intent f38361f;

    /* renamed from: g, reason: collision with root package name */
    private char f38362g;

    /* renamed from: i, reason: collision with root package name */
    private char f38364i;

    /* renamed from: k, reason: collision with root package name */
    private Drawable f38366k;

    /* renamed from: l, reason: collision with root package name */
    private Context f38367l;

    /* renamed from: m, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f38368m;

    /* renamed from: n, reason: collision with root package name */
    private CharSequence f38369n;

    /* renamed from: o, reason: collision with root package name */
    private CharSequence f38370o;

    /* renamed from: h, reason: collision with root package name */
    private int f38363h = 4096;

    /* renamed from: j, reason: collision with root package name */
    private int f38365j = 4096;

    /* renamed from: p, reason: collision with root package name */
    private ColorStateList f38371p = null;

    /* renamed from: q, reason: collision with root package name */
    private PorterDuff.Mode f38372q = null;

    /* renamed from: r, reason: collision with root package name */
    private boolean f38373r = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f38374s = false;

    /* renamed from: t, reason: collision with root package name */
    private int f38375t = 16;

    public C6085a(Context context, int i8, int i9, int i10, int i11, CharSequence charSequence) {
        this.f38367l = context;
        this.f38356a = i9;
        this.f38357b = i8;
        this.f38358c = i11;
        this.f38359d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f38366k;
        if (drawable != null) {
            if (this.f38373r || this.f38374s) {
                Drawable r8 = AbstractC6641a.r(drawable);
                this.f38366k = r8;
                Drawable mutate = r8.mutate();
                this.f38366k = mutate;
                if (this.f38373r) {
                    AbstractC6641a.o(mutate, this.f38371p);
                }
                if (this.f38374s) {
                    AbstractC6641a.p(this.f38366k, this.f38372q);
                }
            }
        }
    }

    @Override // s0.b
    public s0.b a(AbstractC7015b abstractC7015b) {
        throw new UnsupportedOperationException();
    }

    @Override // s0.b
    public AbstractC7015b b() {
        return null;
    }

    @Override // s0.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // s0.b, android.view.MenuItem
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public s0.b setActionView(int i8) {
        throw new UnsupportedOperationException();
    }

    @Override // s0.b, android.view.MenuItem
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public s0.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // s0.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // s0.b, android.view.MenuItem
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public s0.b setShowAsActionFlags(int i8) {
        setShowAsAction(i8);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // s0.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // s0.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f38365j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f38364i;
    }

    @Override // s0.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f38369n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f38357b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f38366k;
    }

    @Override // s0.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f38371p;
    }

    @Override // s0.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f38372q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f38361f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f38356a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // s0.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f38363h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f38362g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f38358c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f38359d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f38360e;
        return charSequence != null ? charSequence : this.f38359d;
    }

    @Override // s0.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f38370o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // s0.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f38375t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f38375t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f38375t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f38375t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c8) {
        this.f38364i = Character.toLowerCase(c8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z7) {
        this.f38375t = (z7 ? 1 : 0) | (this.f38375t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z7) {
        this.f38375t = (z7 ? 2 : 0) | (this.f38375t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z7) {
        this.f38375t = (z7 ? 16 : 0) | (this.f38375t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f38366k = drawable;
        c();
        return this;
    }

    @Override // s0.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f38371p = colorStateList;
        this.f38373r = true;
        c();
        return this;
    }

    @Override // s0.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f38372q = mode;
        this.f38374s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f38361f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c8) {
        this.f38362g = c8;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f38368m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c8, char c9) {
        this.f38362g = c8;
        this.f38364i = Character.toLowerCase(c9);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f38359d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f38360e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z7) {
        this.f38375t = (this.f38375t & 8) | (z7 ? 0 : 8);
        return this;
    }

    @Override // s0.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c8, int i8) {
        this.f38364i = Character.toLowerCase(c8);
        this.f38365j = KeyEvent.normalizeMetaState(i8);
        return this;
    }

    @Override // android.view.MenuItem
    public s0.b setContentDescription(CharSequence charSequence) {
        this.f38369n = charSequence;
        return this;
    }

    @Override // s0.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c8, int i8) {
        this.f38362g = c8;
        this.f38363h = KeyEvent.normalizeMetaState(i8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i8) {
        this.f38359d = this.f38367l.getResources().getString(i8);
        return this;
    }

    @Override // android.view.MenuItem
    public s0.b setTooltipText(CharSequence charSequence) {
        this.f38370o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i8) {
        this.f38366k = AbstractC6278a.e(this.f38367l, i8);
        c();
        return this;
    }

    @Override // s0.b, android.view.MenuItem
    public MenuItem setShortcut(char c8, char c9, int i8, int i9) {
        this.f38362g = c8;
        this.f38363h = KeyEvent.normalizeMetaState(i8);
        this.f38364i = Character.toLowerCase(c9);
        this.f38365j = KeyEvent.normalizeMetaState(i9);
        return this;
    }

    @Override // s0.b, android.view.MenuItem
    public void setShowAsAction(int i8) {
    }
}
