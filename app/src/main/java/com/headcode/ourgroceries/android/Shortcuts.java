package com.headcode.ourgroceries.android;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.PersistableBundle;
import com.headcode.ourgroceries.android.AbstractC5625q;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.ToIntFunction;
import q5.AbstractC6635a;
import t5.AbstractC6804f;

/* loaded from: classes2.dex */
public abstract class Shortcuts {

    private static class ShortcutExtras {

        /* renamed from: a, reason: collision with root package name */
        private final a f34432a;

        /* renamed from: b, reason: collision with root package name */
        private final String f34433b;

        /* renamed from: c, reason: collision with root package name */
        private final String f34434c;

        /* renamed from: d, reason: collision with root package name */
        private final s5.Q f34435d;

        public static class ShortcutException extends Exception {
            public ShortcutException(String str) {
                super(str);
            }
        }

        private ShortcutExtras(a aVar, String str, String str2, s5.Q q8) {
            this.f34432a = aVar;
            this.f34433b = str;
            this.f34434c = str2;
            this.f34435d = q8;
        }

        public static ShortcutExtras a(a aVar, C5688z0 c5688z0) {
            return new ShortcutExtras(aVar, c5688z0.T(), c5688z0.W(), c5688z0.U());
        }

        public static ShortcutExtras b(ShortcutInfo shortcutInfo) {
            PersistableBundle extras = shortcutInfo.getExtras();
            if (extras == null) {
                throw new ShortcutException("missing bundle");
            }
            String string = extras.getString("com.headcode.ourgroceries.android.Shortcuts.ACTION_TYPE");
            if (string == null) {
                throw new ShortcutException("missing action type");
            }
            a valueOf = a.valueOf(string);
            String string2 = extras.getString("com.headcode.ourgroceries.android.Shortcuts.LIST_ID");
            if (string2 == null) {
                throw new ShortcutException("missing list ID");
            }
            String string3 = extras.getString("com.headcode.ourgroceries.android.Shortcuts.LIST_NAME");
            if (string3 == null) {
                throw new ShortcutException("missing list name");
            }
            String string4 = extras.getString("com.headcode.ourgroceries.android.Shortcuts.LIST_TYPE");
            if (string4 != null) {
                return new ShortcutExtras(valueOf, string2, string3, s5.Q.valueOf(string4));
            }
            throw new ShortcutException("missing list type");
        }

        public a c() {
            return this.f34432a;
        }

        public String d() {
            return this.f34433b;
        }

        public String e() {
            return this.f34434c;
        }

        public s5.Q f() {
            return this.f34435d;
        }

        public PersistableBundle g() {
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("com.headcode.ourgroceries.android.Shortcuts.ACTION_TYPE", this.f34432a.name());
            persistableBundle.putString("com.headcode.ourgroceries.android.Shortcuts.LIST_ID", this.f34433b);
            persistableBundle.putString("com.headcode.ourgroceries.android.Shortcuts.LIST_NAME", this.f34434c);
            persistableBundle.putString("com.headcode.ourgroceries.android.Shortcuts.LIST_TYPE", this.f34435d.name());
            return persistableBundle;
        }

        public ShortcutExtras h(String str) {
            return new ShortcutExtras(this.f34432a, str, this.f34434c, this.f34435d);
        }

        public ShortcutExtras i(String str) {
            return new ShortcutExtras(this.f34432a, this.f34433b, str, this.f34435d);
        }

        public String toString() {
            return "ShortcutExtras{mActionType=" + this.f34432a + ", mListId='" + this.f34433b + "', mListName='" + this.f34434c + "', mListType=" + this.f34435d + '}';
        }
    }

    private enum a {
        VIEW_LIST(G2.f33461i, L2.f33741d, AbstractC5625q.b.VIEW),
        ADD_ITEM_TO_LIST(G2.f33460h, L2.f33739b, AbstractC5625q.b.ADD_ITEM),
        SCAN_BARCODE_TO_ADD_ITEM_TO_LIST(G2.f33456d, L2.f33740c, AbstractC5625q.b.SCAN_BARCODE),
        ADD_BY_VOICE_TO_LIST(G2.f33457e, L2.f33738a, AbstractC5625q.b.ADD_BY_VOICE);


        /* renamed from: o, reason: collision with root package name */
        private final int f34441o;

        /* renamed from: s, reason: collision with root package name */
        private final int f34442s;

        /* renamed from: t, reason: collision with root package name */
        private final AbstractC5625q.b f34443t;

        a(int i8, int i9, AbstractC5625q.b bVar) {
            this.f34441o = i8;
            this.f34442s = i9;
            this.f34443t = bVar;
        }

        public int c() {
            return Build.VERSION.SDK_INT >= 26 ? this.f34442s : this.f34441o;
        }

        public AbstractC5625q.b f() {
            return this.f34443t;
        }
    }

    private static void a(Context context, a aVar, C5688z0 c5688z0) {
        ShortcutManager a8 = I3.a(context.getSystemService(AbstractC5677x3.a()));
        if (a8 == null) {
            AbstractC6635a.b("OG-Shortcuts", "Cannot get shortcut manager");
            return;
        }
        List d8 = d(a8);
        if (d8 == null) {
            return;
        }
        Iterator it = d8.iterator();
        String str = null;
        while (it.hasNext()) {
            ShortcutInfo a9 = J3.a(it.next());
            try {
                ShortcutExtras b8 = ShortcutExtras.b(a9);
                if (b8.c() == aVar && b8.d().equals(c5688z0.T())) {
                    str = a9.getId();
                    it.remove();
                }
            } catch (ShortcutExtras.ShortcutException e8) {
                AbstractC6635a.f("OG-Shortcuts", "Bad shortcut: " + e8.getMessage());
                it.remove();
            }
        }
        if (str == null) {
            str = AbstractC6804f.a();
        }
        d8.add(0, e(context, str, ShortcutExtras.a(aVar, c5688z0), 0));
        if (d8.size() > 4) {
            d8 = d8.subList(0, 4);
        }
        try {
            a8.setDynamicShortcuts(f(context, d8));
        } catch (IllegalArgumentException | IllegalStateException e9) {
            AbstractC6635a.f("OG-Shortcuts", "Cannot set shortcuts: " + e9.getMessage());
        }
    }

    public static void b(Context context, C5688z0 c5688z0) {
        if (Build.VERSION.SDK_INT >= 25) {
            a(context, a.ADD_BY_VOICE_TO_LIST, c5688z0);
        }
    }

    public static void c(Context context, C5688z0 c5688z0) {
        if (Build.VERSION.SDK_INT >= 25) {
            a(context, a.ADD_ITEM_TO_LIST, c5688z0);
        }
    }

    private static List d(ShortcutManager shortcutManager) {
        try {
            ArrayList arrayList = new ArrayList(shortcutManager.getDynamicShortcuts());
            Collections.sort(arrayList, Comparator$CC.comparingInt(new ToIntFunction() { // from class: com.headcode.ourgroceries.android.R3
                @Override // java.util.function.ToIntFunction
                public final int applyAsInt(Object obj) {
                    return ((ShortcutInfo) obj).getRank();
                }
            }));
            return arrayList;
        } catch (IllegalStateException e8) {
            AbstractC6635a.f("OG-Shortcuts", "Cannot get dynamic shortcuts: " + e8.getMessage());
            return null;
        }
    }

    private static ShortcutInfo e(Context context, String str, ShortcutExtras shortcutExtras, int i8) {
        return M3.a(context, str).setShortLabel(shortcutExtras.e()).setLongLabel(shortcutExtras.e()).setIcon(Icon.createWithResource(context, shortcutExtras.c().c())).setRank(i8).setExtras(shortcutExtras.g()).setIntents(new Intent[]{AbstractC5625q.d(context), AbstractC5625q.b(context, shortcutExtras.d(), shortcutExtras.f(), shortcutExtras.c().f())}).build();
    }

    private static List f(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i8 = 0; i8 < list.size(); i8++) {
            ShortcutInfo a8 = J3.a(list.get(i8));
            try {
                arrayList.add(e(context, a8.getId(), ShortcutExtras.b(a8), i8));
            } catch (ShortcutExtras.ShortcutException e8) {
                AbstractC6635a.f("OG-Shortcuts", "Bad shortcut: " + e8.getMessage());
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0016 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(android.content.Context r11, com.headcode.ourgroceries.android.C5574j1 r12, android.content.pm.ShortcutManager r13) {
        /*
            java.util.List r0 = d(r13)
            if (r0 != 0) goto L7
            return
        L7:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = r2
        L16:
            boolean r4 = r0.hasNext()
            java.lang.String r5 = "OG-Shortcuts"
            if (r4 == 0) goto Le2
            java.lang.Object r4 = r0.next()
            android.content.pm.ShortcutInfo r4 = com.headcode.ourgroceries.android.J3.a(r4)
            r6 = 1
            com.headcode.ourgroceries.android.Shortcuts$ShortcutExtras r7 = com.headcode.ourgroceries.android.Shortcuts.ShortcutExtras.b(r4)     // Catch: com.headcode.ourgroceries.android.Shortcuts.ShortcutExtras.ShortcutException -> Lc6
            java.lang.String r8 = r7.d()
            com.headcode.ourgroceries.android.z0 r8 = r12.x(r8)
            if (r8 != 0) goto L88
            java.lang.String r3 = r7.e()
            s5.Q r8 = r7.f()
            com.headcode.ourgroceries.android.z0 r3 = r12.z(r3, r8)
            if (r3 != 0) goto L5e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "One is missing: "
            r3.append(r4)
            java.lang.String r4 = r7.e()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            q5.AbstractC6635a.f(r5, r3)
            r3 = 0
            r4 = r3
            goto L86
        L5e:
            java.lang.String r3 = r3.T()
            com.headcode.ourgroceries.android.Shortcuts$ShortcutExtras r3 = r7.h(r3)
            java.lang.String r4 = com.headcode.ourgroceries.android.K3.a(r4)
            android.content.pm.ShortcutInfo r4 = e(r11, r4, r3, r2)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "One has new ID: "
            r7.append(r8)
            java.lang.String r3 = r3.e()
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            q5.AbstractC6635a.f(r5, r3)
        L86:
            r3 = r6
            goto Lbf
        L88:
            java.lang.String r9 = r7.e()
            java.lang.String r10 = r8.W()
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto Lbf
            java.lang.String r3 = r8.W()
            com.headcode.ourgroceries.android.Shortcuts$ShortcutExtras r3 = r7.i(r3)
            java.lang.String r4 = com.headcode.ourgroceries.android.K3.a(r4)
            android.content.pm.ShortcutInfo r4 = e(r11, r4, r3, r2)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "One has new name: "
            r7.append(r8)
            java.lang.String r3 = r3.e()
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            q5.AbstractC6635a.f(r5, r3)
            goto L86
        Lbf:
            if (r4 == 0) goto L16
            r1.add(r4)
            goto L16
        Lc6:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "Bad shortcut: "
            r4.append(r7)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            q5.AbstractC6635a.f(r5, r3)
            r3 = r6
            goto L16
        Le2:
            if (r3 == 0) goto L107
            java.util.List r11 = f(r11, r1)
            com.headcode.ourgroceries.android.L3.a(r13, r11)     // Catch: java.lang.IllegalArgumentException -> Lec java.lang.IllegalStateException -> Lee
            goto L107
        Lec:
            r11 = move-exception
            goto Lef
        Lee:
            r11 = move-exception
        Lef:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Got exception trying to set shortcuts: "
            r12.append(r13)
            java.lang.String r11 = r11.getMessage()
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            q5.AbstractC6635a.f(r5, r11)
        L107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.headcode.ourgroceries.android.Shortcuts.g(android.content.Context, com.headcode.ourgroceries.android.j1, android.content.pm.ShortcutManager):void");
    }

    private static void h(Context context, C5574j1 c5574j1, ShortcutManager shortcutManager) {
        ShortcutExtras b8;
        C5688z0 x7;
        boolean z7;
        try {
            List pinnedShortcuts = shortcutManager.getPinnedShortcuts();
            ArrayList arrayList = new ArrayList(pinnedShortcuts.size());
            Iterator it = pinnedShortcuts.iterator();
            while (it.hasNext()) {
                ShortcutInfo a8 = J3.a(it.next());
                try {
                    b8 = ShortcutExtras.b(a8);
                    x7 = c5574j1.x(b8.d());
                } catch (ShortcutExtras.ShortcutException e8) {
                    AbstractC6635a.f("OG-Shortcuts", "Bad shortcut: " + e8.getMessage());
                }
                if (x7 == null) {
                    C5688z0 z8 = c5574j1.z(b8.e(), b8.f());
                    if (z8 == null) {
                        int i8 = b8.f() == s5.Q.SHOPPING ? M2.f34173r4 : M2.f34165q4;
                        AbstractC6635a.f("OG-Shortcuts", "One is disabled: " + b8.e());
                        try {
                            shortcutManager.disableShortcuts(Collections.singletonList(a8.getId()), context.getString(i8, b8.e()));
                        } catch (IllegalArgumentException | IllegalStateException e9) {
                            AbstractC6635a.f("OG-Shortcuts", "Cannot disable shortcuts: " + e9.getMessage());
                        }
                        z7 = false;
                        if (!z7 && !a8.isEnabled()) {
                            AbstractC6635a.f("OG-Shortcuts", "Re-enabling shortcut: " + b8.e());
                            try {
                                shortcutManager.enableShortcuts(Collections.singletonList(a8.getId()));
                            } catch (IllegalArgumentException | IllegalStateException e10) {
                                AbstractC6635a.f("OG-Shortcuts", "Cannot enable shortcuts: " + e10.getMessage());
                            }
                        }
                    } else {
                        AbstractC6635a.f("OG-Shortcuts", "One has new ID: " + b8.e());
                        b8 = b8.h(z8.T());
                        arrayList.add(e(context, a8.getId(), b8, 0));
                    }
                } else if (!b8.e().equals(x7.W())) {
                    b8 = b8.i(x7.W());
                    arrayList.add(e(context, a8.getId(), b8, 0));
                    AbstractC6635a.f("OG-Shortcuts", "One has new name: " + b8.e());
                }
                z7 = true;
                if (!z7) {
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            try {
                shortcutManager.updateShortcuts(f(context, arrayList));
            } catch (IllegalArgumentException | IllegalStateException e11) {
                AbstractC6635a.f("OG-Shortcuts", "Cannot update shortcuts: " + e11.getMessage());
            }
        } catch (IllegalStateException e12) {
            AbstractC6635a.f("OG-Shortcuts", "Cannot get pinned shortcuts: " + e12.getMessage());
        }
    }

    public static void i(Context context, C5574j1 c5574j1) {
        ShortcutManager a8;
        if (Build.VERSION.SDK_INT < 25 || (a8 = I3.a(context.getSystemService(AbstractC5677x3.a()))) == null) {
            return;
        }
        g(context, c5574j1, a8);
        h(context, c5574j1, a8);
    }

    public static void j(Context context, C5688z0 c5688z0) {
        if (Build.VERSION.SDK_INT >= 25) {
            a(context, a.SCAN_BARCODE_TO_ADD_ITEM_TO_LIST, c5688z0);
        }
    }

    public static void k(Context context, C5688z0 c5688z0) {
        if (Build.VERSION.SDK_INT >= 25) {
            a(context, a.VIEW_LIST, c5688z0);
        }
    }
}
