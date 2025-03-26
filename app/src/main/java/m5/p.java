package m5;

/* loaded from: classes2.dex */
public enum p {
    METALIST(false),
    SHOPPING_LIST(false),
    SHOPPING_LIST_ITEM_DETAILS(true),
    RECIPE(false),
    RECIPE_ITEM_DETAILS(true),
    OTHER(false);


    /* renamed from: o, reason: collision with root package name */
    private final boolean f39217o;

    p(boolean z7) {
        this.f39217o = z7;
    }

    public boolean c() {
        return this.f39217o;
    }
}
