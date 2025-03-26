package k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import z0.AbstractC7015b;

/* loaded from: classes.dex */
public class c extends k.b implements MenuItem {

    /* renamed from: d, reason: collision with root package name */
    private final s0.b f38379d;

    /* renamed from: e, reason: collision with root package name */
    private Method f38380e;

    private class a extends AbstractC7015b implements ActionProvider.VisibilityListener {

        /* renamed from: d, reason: collision with root package name */
        private AbstractC7015b.InterfaceC0359b f38381d;

        /* renamed from: e, reason: collision with root package name */
        private final ActionProvider f38382e;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f38382e = actionProvider;
        }

        @Override // z0.AbstractC7015b
        public boolean a() {
            return this.f38382e.hasSubMenu();
        }

        @Override // z0.AbstractC7015b
        public boolean b() {
            return this.f38382e.isVisible();
        }

        @Override // z0.AbstractC7015b
        public View c(MenuItem menuItem) {
            return this.f38382e.onCreateActionView(menuItem);
        }

        @Override // z0.AbstractC7015b
        public boolean d() {
            return this.f38382e.onPerformDefaultAction();
        }

        @Override // z0.AbstractC7015b
        public void e(SubMenu subMenu) {
            this.f38382e.onPrepareSubMenu(c.this.d(subMenu));
        }

        @Override // z0.AbstractC7015b
        public boolean f() {
            return this.f38382e.overridesItemVisibility();
        }

        @Override // z0.AbstractC7015b
        public void i(AbstractC7015b.InterfaceC0359b interfaceC0359b) {
            this.f38381d = interfaceC0359b;
            this.f38382e.setVisibilityListener(interfaceC0359b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z7) {
            AbstractC7015b.InterfaceC0359b interfaceC0359b = this.f38381d;
            if (interfaceC0359b != null) {
                interfaceC0359b.onActionProviderVisibilityChanged(z7);
            }
        }
    }

    static class b extends FrameLayout implements androidx.appcompat.view.c {

        /* renamed from: o, reason: collision with root package name */
        final CollapsibleActionView f38384o;

        /* JADX WARN: Multi-variable type inference failed */
        b(View view) {
            super(view.getContext());
            this.f38384o = (CollapsibleActionView) view;
            addView(view);
        }

        View a() {
            return (View) this.f38384o;
        }

        @Override // androidx.appcompat.view.c
        public void c() {
            this.f38384o.onActionViewExpanded();
        }

        @Override // androidx.appcompat.view.c
        public void e() {
            this.f38384o.onActionViewCollapsed();
        }
    }

    /* renamed from: k.c$c, reason: collision with other inner class name */
    private class MenuItemOnActionExpandListenerC0282c implements MenuItem.OnActionExpandListener {

        /* renamed from: a, reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f38385a;

        MenuItemOnActionExpandListenerC0282c(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f38385a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f38385a.onMenuItemActionCollapse(c.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f38385a.onMenuItemActionExpand(c.this.c(menuItem));
        }
    }

    private class d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: o, reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f38387o;

        d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f38387o = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f38387o.onMenuItemClick(c.this.c(menuItem));
        }
    }

    public c(Context context, s0.b bVar) {
        super(context);
        if (bVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f38379d = bVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f38379d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f38379d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC7015b b8 = this.f38379d.b();
        if (b8 instanceof a) {
            return ((a) b8).f38382e;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f38379d.getActionView();
        return actionView instanceof b ? ((b) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f38379d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f38379d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f38379d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f38379d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f38379d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f38379d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f38379d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f38379d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f38379d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f38379d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f38379d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f38379d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f38379d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return d(this.f38379d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f38379d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f38379d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f38379d.getTooltipText();
    }

    public void h(boolean z7) {
        try {
            if (this.f38380e == null) {
                this.f38380e = this.f38379d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f38380e.invoke(this.f38379d, Boolean.valueOf(z7));
        } catch (Exception e8) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e8);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f38379d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f38379d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f38379d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f38379d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f38379d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f38379d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        a aVar = new a(this.f38376a, actionProvider);
        s0.b bVar = this.f38379d;
        if (actionProvider == null) {
            aVar = null;
        }
        bVar.a(aVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        this.f38379d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c8) {
        this.f38379d.setAlphabeticShortcut(c8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z7) {
        this.f38379d.setCheckable(z7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z7) {
        this.f38379d.setChecked(z7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f38379d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z7) {
        this.f38379d.setEnabled(z7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f38379d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f38379d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f38379d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f38379d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c8) {
        this.f38379d.setNumericShortcut(c8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f38379d.setOnActionExpandListener(onActionExpandListener != null ? new MenuItemOnActionExpandListenerC0282c(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f38379d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new d(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c8, char c9) {
        this.f38379d.setShortcut(c8, c9);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i8) {
        this.f38379d.setShowAsAction(i8);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i8) {
        this.f38379d.setShowAsActionFlags(i8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f38379d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f38379d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f38379d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z7) {
        return this.f38379d.setVisible(z7);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c8, int i8) {
        this.f38379d.setAlphabeticShortcut(c8, i8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i8) {
        this.f38379d.setIcon(i8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c8, int i8) {
        this.f38379d.setNumericShortcut(c8, i8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c8, char c9, int i8, int i9) {
        this.f38379d.setShortcut(c8, c9, i8, i9);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i8) {
        this.f38379d.setTitle(i8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i8) {
        this.f38379d.setActionView(i8);
        View actionView = this.f38379d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f38379d.setActionView(new b(actionView));
        }
        return this;
    }
}
