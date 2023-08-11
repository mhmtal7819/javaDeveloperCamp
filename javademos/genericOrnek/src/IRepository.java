public interface IRepository<T extends IEntitiy> { //burda kuıllanıcının karısıklık yaşamaması ıcın yeni int. actık
    void add(T entity);
    void delete(T entity);
    void update(T entity);
}
