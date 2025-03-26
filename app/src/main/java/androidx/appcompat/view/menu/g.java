package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.k;
import f.AbstractC5759h;
import g.AbstractC5794a;
import r0.AbstractC6641a;
import z0.AbstractC7015b;

/* loaded from: classes.dex */
public final class g implements s0.b {

    /* renamed from: A, reason: collision with root package name */
    private View f7185A;

    /* renamed from: B, reason: collision with root package name */
    private AbstractC7015b f7186B;

    /* renamed from: C, reason: collision with root package name */
    private MenuItem.OnActionExpandListener f7187C;

    /* renamed from: E, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f7189E;

    /* renamed from: a, reason: collision with root package name */
    private final int f7190a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7191b;

    /* renamed from: c, reason: collision with root package name */
    private final int f7192c;

    /* renamed from: d, reason: collision with root package name */
    private final int f7193d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f7194e;

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f7195f;

    /* renamed from: g, reason: collision with root package name */
    private Intent f7196g;

    /* renamed from: h, reason: collision with root package name */
    private char f7197h;

    /* renamed from: j, reason: collision with root package name */
    private char f7199j;

    /* renamed from: l, reason: collision with root package name */
    private Drawable f7201l;

    /* renamed from: n, reason: collision with root package name */
    e f7203n;

    /* renamed from: o, reason: collision with root package name */
    private m f7204o;

    /* renamed from: p, reason: collision with root package name */
    private Runnable f7205p;

    /* renamed from: q, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f7206q;

    /* renamed from: r, reason: collision with root package name */
    private CharSequence f7207r;

    /* renamed from: s, reason: collision with root package name */
    private CharSequence f7208s;

    /* renamed from: z, reason: collision with root package name */
    private int f7215z;

    /* renamed from: i, reason: collision with root package name */
    private int f7198i = 4096;

    /* renamed from: k, reason: collision with root package name */
    private int f7200k = 4096;

    /* renamed from: m, reason: collision with root package name */
    private int f7202m = 0;

    /* renamed from: t, reason: collision with root package name */
    private ColorStateList f7209t = null;

    /* renamed from: u, reason: collision with root package name */
    private PorterDuff.Mode f7210u = null;

    /* renamed from: v, reason: collision with root package name */
    private boolean f7211v = false;

    /* renamed from: w, reason: collision with root package name */
    private boolean f7212w = false;

    /* renamed from: x, reason: collision with root package name */
    private boolean f7213x = false;

    /* renamed from: y, reason: collision with root package name */
    private int f7214y = 16;

    /* renamed from: D, reason: collision with root package name */
    private boolean f7188D = false;

    class a implements AbstractC7015b.InterfaceC0359b {
        a() {
        }

        @Override // z0.AbstractC7015b.InterfaceC0359b
        public void onActionProviderVisibilityChanged(boolean z7) {
            g gVar = g.this;
            gVar.f7203n.K(gVar);
        }
    }

    g(e eVar, int i8, int i9, int i10, int i11, CharSequence charSequence, int i12) {
        this.f7203n = eVar;
        this.f7190a = i9;
        this.f7191b = i8;
        this.f7192c = i10;
        this.f7193d = i11;
        this.f7194e = charSequence;
        this.f7215z = i12;
    }

    private static void d(StringBuilder sb, int i8, int i9, String str) {
        if ((i8 & i9) == i9) {
            sb.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f7213x && (this.f7211v || this.f7212w)) {
            drawable = AbstractC6641a.r(drawable).mutate();
            if (this.f7211v) {
                AbstractC6641a.o(drawable, this.f7209t);
            }
            if (this.f7212w) {
                AbstractC6641a.p(drawable, this.f7210u);
            }
            this.f7213x = false;
        }
        return drawable;
    }

    boolean A() {
        return this.f7203n.I() && g() != 0;
    }

    public boolean B() {
        return (this.f7215z & 4) == 4;
    }

    @Override // s0.b
    public s0.b a(AbstractC7015b abstractC7015b) {
        AbstractC7015b abstractC7015b2 = this.f7186B;
        if (abstractC7015b2 != null) {
            abstractC7015b2.g();
        }
        this.f7185A = null;
        this.f7186B = abstractC7015b;
        this.f7203n.L(true);
        AbstractC7015b abstractC7015b3 = this.f7186B;
        if (abstractC7015b3 != null) {
            abstractC7015b3.i(new a());
        }
        return this;
    }

    @Override // s0.b
    public AbstractC7015b b() {
        return this.f7186B;
    }

    public void c() {
        this.f7203n.J(this);
    }

    @Override // s0.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f7215z & 8) == 0) {
            return false;
        }
        if (this.f7185A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f7187C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f7203n.f(this);
        }
        return false;
    }

    @Override // s0.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f7187C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f7203n.k(this);
        }
        return false;
    }

    public int f() {
        return this.f7193d;
    }

    char g() {
        return this.f7203n.H() ? this.f7199j : this.f7197h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // s0.b, android.view.MenuItem
    public View getActionView() {
        View view = this.f7185A;
        if (view != null) {
            return view;
        }
        AbstractC7015b abstractC7015b = this.f7186B;
        if (abstractC7015b == null) {
            return null;
        }
        View c8 = abstractC7015b.c(this);
        this.f7185A = c8;
        return c8;
    }

    @Override // s0.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f7200k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f7199j;
    }

    @Override // s0.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f7207r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f7191b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f7201l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f7202m == 0) {
            return null;
        }
        Drawable b8 = AbstractC5794a.b(this.f7203n.u(), this.f7202m);
        this.f7202m = 0;
        this.f7201l = b8;
        return e(b8);
    }

    @Override // s0.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f7209t;
    }

    @Override // s0.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f7210u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f7196g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f7190a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f7189E;
    }

    @Override // s0.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f7198i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f7197h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f7192c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f7204o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f7194e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f7195f;
        return charSequence != null ? charSequence : this.f7194e;
    }

    @Override // s0.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f7208s;
    }

    String h() {
        char g8 = g();
        if (g8 == 0) {
            return "";
        }
        Resources resources = this.f7203n.u().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f7203n.u()).hasPermanentMenuKey()) {
            sb.append(resources.getString(AbstractC5759h.f35541m));
        }
        int i8 = this.f7203n.H() ? this.f7200k : this.f7198i;
        d(sb, i8, 65536, resources.getString(AbstractC5759h.f35537i));
        d(sb, i8, 4096, resources.getString(AbstractC5759h.f35533e));
        d(sb, i8, 2, resources.getString(AbstractC5759h.f35532d));
        d(sb, i8, 1, resources.getString(AbstractC5759h.f35538j));
        d(sb, i8, 4, resources.getString(AbstractC5759h.f35540l));
        d(sb, i8, 8, resources.getString(AbstractC5759h.f35536h));
        if (g8 == '\b') {
            sb.append(resources.getString(AbstractC5759h.f35534f));
        } else if (g8 == '\n') {
            sb.append(resources.getString(AbstractC5759h.f35535g));
        } else if (g8 != ' ') {
            sb.append(g8);
        } else {
            sb.append(resources.getString(AbstractC5759h.f35539k));
        }
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f7204o != null;
    }

    CharSequence i(k.a aVar) {
        return (aVar == null || !aVar.d()) ? getTitle() : getTitleCondensed();
    }

    @Override // s0.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f7188D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f7214y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f7214y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f7214y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC7015b abstractC7015b = this.f7186B;
        return (abstractC7015b == null || !abstractC7015b.f()) ? (this.f7214y & 8) == 0 : (this.f7214y & 8) == 0 && this.f7186B.b();
    }

    public boolean j() {
        AbstractC7015b abstractC7015b;
        if ((this.f7215z & 8) == 0) {
            return false;
        }
        if (this.f7185A == null && (abstractC7015b = this.f7186B) != null) {
            this.f7185A = abstractC7015b.c(this);
        }
        return this.f7185A != null;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f7206q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        e eVar = this.f7203n;
        if (eVar.h(eVar, this)) {
            return true;
        }
        Runnable runnable = this.f7205p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f7196g != null) {
            try {
                this.f7203n.u().startActivity(this.f7196g);
                return true;
            } catch (ActivityNotFoundException e8) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e8);
            }
        }
        AbstractC7015b abstractC7015b = this.f7186B;
        return abstractC7015b != null && abstractC7015b.d();
    }

    public boolean l() {
        return (this.f7214y & 32) == 32;
    }

    public boolean m() {
        return (this.f7214y & 4) != 0;
    }

    public boolean n() {
        return (this.f7215z & 1) == 1;
    }

    public boolean o() {
        return (this.f7215z & 2) == 2;
    }

    @Override // s0.b, android.view.MenuItem
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public s0.b setActionView(int i8) {
        Context u7 = this.f7203n.u();
        setActionView(LayoutInflater.from(u7).inflate(i8, (ViewGroup) new LinearLayout(u7), false));
        return this;
    }

    @Override // s0.b, android.view.MenuItem
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public s0.b setActionView(View view) {
        int i8;
        this.f7185A = view;
        this.f7186B = null;
        if (view != null && view.getId() == -1 && (i8 = this.f7190a) > 0) {
            view.setId(i8);
        }
        this.f7203n.J(this);
        return this;
    }

    public void r(boolean z7) {
        this.f7188D = z7;
        this.f7203n.L(false);
    }

    void s(boolean z7) {
        int i8 = this.f7214y;
        int i9 = (z7 ? 2 : 0) | (i8 & (-3));
        this.f7214y = i9;
        if (i8 != i9) {
            this.f7203n.L(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c8) {
        if (this.f7199j == c8) {
            return this;
        }
        this.f7199j = Character.toLowerCase(c8);
        this.f7203n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z7) {
        int i8 = this.f7214y;
        int i9 = (z7 ? 1 : 0) | (i8 & (-2));
        this.f7214y = i9;
        if (i8 != i9) {
            this.f7203n.L(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z7) {
        if ((this.f7214y & 4) != 0) {
            this.f7203n.U(this);
        } else {
            s(z7);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z7) {
        if (z7) {
            this.f7214y |= 16;
        } else {
            this.f7214y &= -17;
        }
        this.f7203n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f7202m = 0;
        this.f7201l = drawable;
        this.f7213x = true;
        this.f7203n.L(false);
        return this;
    }

    @Override // s0.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f7209t = colorStateList;
        this.f7211v = true;
        this.f7213x = true;
        this.f7203n.L(false);
        return this;
    }

    @Override // s0.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f7210u = mode;
        this.f7212w = true;
        this.f7213x = true;
        this.f7203n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f7196g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c8) {
        if (this.f7197h == c8) {
            return this;
        }
        this.f7197h = c8;
        this.f7203n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f7187C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f7206q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c8, char c9) {
        this.f7197h = c8;
        this.f7199j = Character.toLowerCase(c9);
        this.f7203n.L(false);
        return this;
    }

    @Override // s0.b, android.view.MenuItem
    public void setShowAsAction(int i8) {
        int i9 = i8 & 3;
        if (i9 != 0 && i9 != 1 && i9 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f7215z = i8;
        this.f7203n.J(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f7194e = charSequence;
        this.f7203n.L(false);
        m mVar = this.f7204o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f7195f = charSequence;
        this.f7203n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z7) {
        if (y(z7)) {
            this.f7203n.K(this);
        }
        return this;
    }

    public void t(boolean z7) {
        this.f7214y = (z7 ? 4 : 0) | (this.f7214y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f7194e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z7) {
        if (z7) {
            this.f7214y |= 32;
        } else {
            this.f7214y &= -33;
        }
    }

    void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f7189E = contextMenuInfo;
    }

    @Override // s0.b, android.view.MenuItem
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public s0.b setShowAsActionFlags(int i8) {
        setShowAsAction(i8);
        return this;
    }

    public void x(m mVar) {
        this.f7204o = mVar;
        mVar.setHeaderTitle(getTitle());
    }

    boolean y(boolean z7) {
        int i8 = this.f7214y;
        int i9 = (z7 ? 0 : 8) | (i8 & (-9));
        this.f7214y = i9;
        return i8 != i9;
    }

    public boolean z() {
        return this.f7203n.A();
    }

    @Override // android.view.MenuItem
    public s0.b setContentDescription(CharSequence charSequence) {
        this.f7207r = charSequence;
        this.f7203n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public s0.b setTooltipText(CharSequence charSequence) {
        this.f7208s = charSequence;
        this.f7203n.L(false);
        return this;
    }

    @Override // s0.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c8, int i8) {
        if (this.f7199j == c8 && this.f7200k == i8) {
            return this;
        }
        this.f7199j = Character.toLowerCase(c8);
        this.f7200k = KeyEvent.normalizeMetaState(i8);
        this.f7203n.L(false);
        return this;
    }

    @Override // s0.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c8, int i8) {
        if (this.f7197h == c8 && this.f7198i == i8) {
            return this;
        }
        this.f7197h = c8;
        this.f7198i = KeyEvent.normalizeMetaState(i8);
        this.f7203n.L(false);
        return this;
    }

    @Override // s0.b, android.view.MenuItem
    public MenuItem setShortcut(char c8, char c9, int i8, int i9) {
        this.f7197h = c8;
        this.f7198i = KeyEvent.normalizeMetaState(i8);
        this.f7199j = Character.toLowerCase(c9);
        this.f7200k = KeyEvent.normalizeMetaState(i9);
        this.f7203n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i8) {
        this.f7201l = null;
        this.f7202m = i8;
        this.f7213x = true;
        this.f7203n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i8) {
        return setTitle(this.f7203n.u().getString(i8));
    }
}
