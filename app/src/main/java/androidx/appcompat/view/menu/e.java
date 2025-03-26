package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import o0.AbstractC6278a;
import s0.InterfaceMenuC6720a;
import z0.AbstractC7015b;

/* loaded from: classes.dex */
public class e implements InterfaceMenuC6720a {

    /* renamed from: A, reason: collision with root package name */
    private static final int[] f7154A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    private final Context f7155a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f7156b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7157c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f7158d;

    /* renamed from: e, reason: collision with root package name */
    private a f7159e;

    /* renamed from: m, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f7167m;

    /* renamed from: n, reason: collision with root package name */
    CharSequence f7168n;

    /* renamed from: o, reason: collision with root package name */
    Drawable f7169o;

    /* renamed from: p, reason: collision with root package name */
    View f7170p;

    /* renamed from: x, reason: collision with root package name */
    private g f7178x;

    /* renamed from: z, reason: collision with root package name */
    private boolean f7180z;

    /* renamed from: l, reason: collision with root package name */
    private int f7166l = 0;

    /* renamed from: q, reason: collision with root package name */
    private boolean f7171q = false;

    /* renamed from: r, reason: collision with root package name */
    private boolean f7172r = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f7173s = false;

    /* renamed from: t, reason: collision with root package name */
    private boolean f7174t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f7175u = false;

    /* renamed from: v, reason: collision with root package name */
    private ArrayList f7176v = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    private CopyOnWriteArrayList f7177w = new CopyOnWriteArrayList();

    /* renamed from: y, reason: collision with root package name */
    private boolean f7179y = false;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList f7160f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f7161g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private boolean f7162h = true;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f7163i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private ArrayList f7164j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private boolean f7165k = true;

    public interface a {
        boolean a(e eVar, MenuItem menuItem);

        void b(e eVar);
    }

    public interface b {
        boolean a(g gVar);
    }

    public e(Context context) {
        this.f7155a = context;
        this.f7156b = context.getResources();
        c0(true);
    }

    private static int B(int i8) {
        int i9 = ((-65536) & i8) >> 16;
        if (i9 >= 0) {
            int[] iArr = f7154A;
            if (i9 < iArr.length) {
                return (i8 & 65535) | (iArr[i9] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void O(int i8, boolean z7) {
        if (i8 < 0 || i8 >= this.f7160f.size()) {
            return;
        }
        this.f7160f.remove(i8);
        if (z7) {
            L(true);
        }
    }

    private void X(int i8, CharSequence charSequence, int i9, Drawable drawable, View view) {
        Resources C7 = C();
        if (view != null) {
            this.f7170p = view;
            this.f7168n = null;
            this.f7169o = null;
        } else {
            if (i8 > 0) {
                this.f7168n = C7.getText(i8);
            } else if (charSequence != null) {
                this.f7168n = charSequence;
            }
            if (i9 > 0) {
                this.f7169o = AbstractC6278a.e(u(), i9);
            } else if (drawable != null) {
                this.f7169o = drawable;
            }
            this.f7170p = null;
        }
        L(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c0(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1c
            android.content.res.Resources r3 = r2.f7156b
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L1c
            android.content.Context r3 = r2.f7155a
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.f7155a
            boolean r3 = z0.AbstractC7014a0.l(r3, r1)
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r2.f7158d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.c0(boolean):void");
    }

    private g g(int i8, int i9, int i10, int i11, CharSequence charSequence, int i12) {
        return new g(this, i8, i9, i10, i11, charSequence, i12);
    }

    private void i(boolean z7) {
        if (this.f7177w.isEmpty()) {
            return;
        }
        e0();
        Iterator it = this.f7177w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            j jVar = (j) weakReference.get();
            if (jVar == null) {
                this.f7177w.remove(weakReference);
            } else {
                jVar.d(z7);
            }
        }
        d0();
    }

    private boolean j(m mVar, j jVar) {
        if (this.f7177w.isEmpty()) {
            return false;
        }
        boolean k8 = jVar != null ? jVar.k(mVar) : false;
        Iterator it = this.f7177w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            j jVar2 = (j) weakReference.get();
            if (jVar2 == null) {
                this.f7177w.remove(weakReference);
            } else if (!k8) {
                k8 = jVar2.k(mVar);
            }
        }
        return k8;
    }

    private static int n(ArrayList arrayList, int i8) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((g) arrayList.get(size)).f() <= i8) {
                return size + 1;
            }
        }
        return 0;
    }

    boolean A() {
        return this.f7174t;
    }

    Resources C() {
        return this.f7156b;
    }

    public e D() {
        return this;
    }

    public ArrayList E() {
        if (!this.f7162h) {
            return this.f7161g;
        }
        this.f7161g.clear();
        int size = this.f7160f.size();
        for (int i8 = 0; i8 < size; i8++) {
            g gVar = (g) this.f7160f.get(i8);
            if (gVar.isVisible()) {
                this.f7161g.add(gVar);
            }
        }
        this.f7162h = false;
        this.f7165k = true;
        return this.f7161g;
    }

    public boolean F() {
        return !this.f7171q;
    }

    public boolean G() {
        return this.f7179y;
    }

    boolean H() {
        return this.f7157c;
    }

    public boolean I() {
        return this.f7158d;
    }

    void J(g gVar) {
        this.f7165k = true;
        L(true);
    }

    void K(g gVar) {
        this.f7162h = true;
        L(true);
    }

    public void L(boolean z7) {
        if (this.f7171q) {
            this.f7172r = true;
            if (z7) {
                this.f7173s = true;
                return;
            }
            return;
        }
        if (z7) {
            this.f7162h = true;
            this.f7165k = true;
        }
        i(z7);
    }

    public boolean M(MenuItem menuItem, int i8) {
        return N(menuItem, null, i8);
    }

    public boolean N(MenuItem menuItem, j jVar, int i8) {
        g gVar = (g) menuItem;
        if (gVar == null || !gVar.isEnabled()) {
            return false;
        }
        boolean k8 = gVar.k();
        AbstractC7015b b8 = gVar.b();
        boolean z7 = b8 != null && b8.a();
        if (gVar.j()) {
            k8 |= gVar.expandActionView();
            if (k8) {
                e(true);
            }
        } else if (gVar.hasSubMenu() || z7) {
            if ((i8 & 4) == 0) {
                e(false);
            }
            if (!gVar.hasSubMenu()) {
                gVar.x(new m(u(), this, gVar));
            }
            m mVar = (m) gVar.getSubMenu();
            if (z7) {
                b8.e(mVar);
            }
            k8 |= j(mVar, jVar);
            if (!k8) {
                e(true);
            }
        } else if ((i8 & 1) == 0) {
            e(true);
        }
        return k8;
    }

    public void P(j jVar) {
        Iterator it = this.f7177w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            j jVar2 = (j) weakReference.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.f7177w.remove(weakReference);
            }
        }
    }

    public void Q(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(t());
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            MenuItem item = getItem(i8);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).Q(bundle);
            }
        }
        int i9 = bundle.getInt("android:menu:expandedactionview");
        if (i9 <= 0 || (findItem = findItem(i9)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public void R(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i8 = 0; i8 < size; i8++) {
            MenuItem item = getItem(i8);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).R(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(t(), sparseArray);
        }
    }

    public void S(a aVar) {
        this.f7159e = aVar;
    }

    public e T(int i8) {
        this.f7166l = i8;
        return this;
    }

    void U(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f7160f.size();
        e0();
        for (int i8 = 0; i8 < size; i8++) {
            g gVar = (g) this.f7160f.get(i8);
            if (gVar.getGroupId() == groupId && gVar.m() && gVar.isCheckable()) {
                gVar.s(gVar == menuItem);
            }
        }
        d0();
    }

    protected e V(int i8) {
        X(0, null, i8, null, null);
        return this;
    }

    protected e W(Drawable drawable) {
        X(0, null, 0, drawable, null);
        return this;
    }

    protected e Y(int i8) {
        X(i8, null, 0, null, null);
        return this;
    }

    protected e Z(CharSequence charSequence) {
        X(0, charSequence, 0, null, null);
        return this;
    }

    protected MenuItem a(int i8, int i9, int i10, CharSequence charSequence) {
        int B7 = B(i10);
        g g8 = g(i8, i9, i10, B7, charSequence, this.f7166l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f7167m;
        if (contextMenuInfo != null) {
            g8.v(contextMenuInfo);
        }
        ArrayList arrayList = this.f7160f;
        arrayList.add(n(arrayList, B7), g8);
        L(true);
        return g8;
    }

    protected e a0(View view) {
        X(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i8, int i9, int i10, ComponentName componentName, Intent[] intentArr, Intent intent, int i11, MenuItem[] menuItemArr) {
        int i12;
        PackageManager packageManager = this.f7155a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i11 & 1) == 0) {
            removeGroup(i8);
        }
        for (int i13 = 0; i13 < size; i13++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i13);
            int i14 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i14 < 0 ? intent : intentArr[i14]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i8, i9, i10, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i12 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i12] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(j jVar) {
        c(jVar, this.f7155a);
    }

    public void b0(boolean z7) {
        this.f7180z = z7;
    }

    public void c(j jVar, Context context) {
        this.f7177w.add(new WeakReference(jVar));
        jVar.i(context, this);
        this.f7165k = true;
    }

    @Override // android.view.Menu
    public void clear() {
        g gVar = this.f7178x;
        if (gVar != null) {
            f(gVar);
        }
        this.f7160f.clear();
        L(true);
    }

    public void clearHeader() {
        this.f7169o = null;
        this.f7168n = null;
        this.f7170p = null;
        L(false);
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f7159e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public void d0() {
        this.f7171q = false;
        if (this.f7172r) {
            this.f7172r = false;
            L(this.f7173s);
        }
    }

    public final void e(boolean z7) {
        if (this.f7175u) {
            return;
        }
        this.f7175u = true;
        Iterator it = this.f7177w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            j jVar = (j) weakReference.get();
            if (jVar == null) {
                this.f7177w.remove(weakReference);
            } else {
                jVar.c(this, z7);
            }
        }
        this.f7175u = false;
    }

    public void e0() {
        if (this.f7171q) {
            return;
        }
        this.f7171q = true;
        this.f7172r = false;
        this.f7173s = false;
    }

    public boolean f(g gVar) {
        boolean z7 = false;
        if (!this.f7177w.isEmpty() && this.f7178x == gVar) {
            e0();
            Iterator it = this.f7177w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                j jVar = (j) weakReference.get();
                if (jVar == null) {
                    this.f7177w.remove(weakReference);
                } else {
                    z7 = jVar.f(this, gVar);
                    if (z7) {
                        break;
                    }
                }
            }
            d0();
            if (z7) {
                this.f7178x = null;
            }
        }
        return z7;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i8) {
        MenuItem findItem;
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            g gVar = (g) this.f7160f.get(i9);
            if (gVar.getItemId() == i8) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (findItem = gVar.getSubMenu().findItem(i8)) != null) {
                return findItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i8) {
        return (MenuItem) this.f7160f.get(i8);
    }

    boolean h(e eVar, MenuItem menuItem) {
        a aVar = this.f7159e;
        return aVar != null && aVar.a(eVar, menuItem);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f7180z) {
            return true;
        }
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (((g) this.f7160f.get(i8)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i8, KeyEvent keyEvent) {
        return p(i8, keyEvent) != null;
    }

    public boolean k(g gVar) {
        boolean z7 = false;
        if (this.f7177w.isEmpty()) {
            return false;
        }
        e0();
        Iterator it = this.f7177w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            j jVar = (j) weakReference.get();
            if (jVar == null) {
                this.f7177w.remove(weakReference);
            } else {
                z7 = jVar.g(this, gVar);
                if (z7) {
                    break;
                }
            }
        }
        d0();
        if (z7) {
            this.f7178x = gVar;
        }
        return z7;
    }

    public int l(int i8) {
        return m(i8, 0);
    }

    public int m(int i8, int i9) {
        int size = size();
        if (i9 < 0) {
            i9 = 0;
        }
        while (i9 < size) {
            if (((g) this.f7160f.get(i9)).getGroupId() == i8) {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    public int o(int i8) {
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            if (((g) this.f7160f.get(i9)).getItemId() == i8) {
                return i9;
            }
        }
        return -1;
    }

    g p(int i8, KeyEvent keyEvent) {
        ArrayList arrayList = this.f7176v;
        arrayList.clear();
        q(arrayList, i8, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (g) arrayList.get(0);
        }
        boolean H7 = H();
        for (int i9 = 0; i9 < size; i9++) {
            g gVar = (g) arrayList.get(i9);
            char alphabeticShortcut = H7 ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (H7 && alphabeticShortcut == '\b' && i8 == 67))) {
                return gVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i8, int i9) {
        return M(findItem(i8), i9);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i8, KeyEvent keyEvent, int i9) {
        g p8 = p(i8, keyEvent);
        boolean M7 = p8 != null ? M(p8, i9) : false;
        if ((i9 & 2) != 0) {
            e(true);
        }
        return M7;
    }

    void q(List list, int i8, KeyEvent keyEvent) {
        boolean H7 = H();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i8 == 67) {
            int size = this.f7160f.size();
            for (int i9 = 0; i9 < size; i9++) {
                g gVar = (g) this.f7160f.get(i9);
                if (gVar.hasSubMenu()) {
                    ((e) gVar.getSubMenu()).q(list, i8, keyEvent);
                }
                char alphabeticShortcut = H7 ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
                if ((modifiers & 69647) == ((H7 ? gVar.getAlphabeticModifiers() : gVar.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (H7 && alphabeticShortcut == '\b' && i8 == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    public void r() {
        ArrayList E7 = E();
        if (this.f7165k) {
            Iterator it = this.f7177w.iterator();
            boolean z7 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                j jVar = (j) weakReference.get();
                if (jVar == null) {
                    this.f7177w.remove(weakReference);
                } else {
                    z7 |= jVar.e();
                }
            }
            if (z7) {
                this.f7163i.clear();
                this.f7164j.clear();
                int size = E7.size();
                for (int i8 = 0; i8 < size; i8++) {
                    g gVar = (g) E7.get(i8);
                    if (gVar.l()) {
                        this.f7163i.add(gVar);
                    } else {
                        this.f7164j.add(gVar);
                    }
                }
            } else {
                this.f7163i.clear();
                this.f7164j.clear();
                this.f7164j.addAll(E());
            }
            this.f7165k = false;
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i8) {
        int l8 = l(i8);
        if (l8 >= 0) {
            int size = this.f7160f.size() - l8;
            int i9 = 0;
            while (true) {
                int i10 = i9 + 1;
                if (i9 >= size || ((g) this.f7160f.get(l8)).getGroupId() != i8) {
                    break;
                }
                O(l8, false);
                i9 = i10;
            }
            L(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i8) {
        O(o(i8), true);
    }

    public ArrayList s() {
        r();
        return this.f7163i;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i8, boolean z7, boolean z8) {
        int size = this.f7160f.size();
        for (int i9 = 0; i9 < size; i9++) {
            g gVar = (g) this.f7160f.get(i9);
            if (gVar.getGroupId() == i8) {
                gVar.t(z8);
                gVar.setCheckable(z7);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z7) {
        this.f7179y = z7;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i8, boolean z7) {
        int size = this.f7160f.size();
        for (int i9 = 0; i9 < size; i9++) {
            g gVar = (g) this.f7160f.get(i9);
            if (gVar.getGroupId() == i8) {
                gVar.setEnabled(z7);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i8, boolean z7) {
        int size = this.f7160f.size();
        boolean z8 = false;
        for (int i9 = 0; i9 < size; i9++) {
            g gVar = (g) this.f7160f.get(i9);
            if (gVar.getGroupId() == i8 && gVar.y(z7)) {
                z8 = true;
            }
        }
        if (z8) {
            L(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z7) {
        this.f7157c = z7;
        L(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f7160f.size();
    }

    protected String t() {
        return "android:menu:actionviewstates";
    }

    public Context u() {
        return this.f7155a;
    }

    public g v() {
        return this.f7178x;
    }

    public Drawable w() {
        return this.f7169o;
    }

    public CharSequence x() {
        return this.f7168n;
    }

    public View y() {
        return this.f7170p;
    }

    public ArrayList z() {
        r();
        return this.f7164j;
    }

    @Override // android.view.Menu
    public MenuItem add(int i8) {
        return a(0, 0, 0, this.f7156b.getString(i8));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i8) {
        return addSubMenu(0, 0, 0, this.f7156b.getString(i8));
    }

    @Override // android.view.Menu
    public MenuItem add(int i8, int i9, int i10, CharSequence charSequence) {
        return a(i8, i9, i10, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i8, int i9, int i10, CharSequence charSequence) {
        g gVar = (g) a(i8, i9, i10, charSequence);
        m mVar = new m(this.f7155a, this, gVar);
        gVar.x(mVar);
        return mVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i8, int i9, int i10, int i11) {
        return a(i8, i9, i10, this.f7156b.getString(i11));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i8, int i9, int i10, int i11) {
        return addSubMenu(i8, i9, i10, this.f7156b.getString(i11));
    }
}
